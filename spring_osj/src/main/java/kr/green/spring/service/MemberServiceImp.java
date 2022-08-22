package kr.green.spring.service;

import java.util.ArrayList;
import java.util.Random;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	MemberDAO memberDao;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public boolean signup(MemberVO member) {
		// 유효성 검사
		if(member == null)
			return false;
		
		if(member.getMe_id() == null || member.getMe_id().length() == 0)
			return false;
		
		if(member.getMe_pw() == null || member.getMe_pw().length() == 0)
			return false;
		
		if(member.getMe_email() == null || member.getMe_email().length() == 0)
			return false;
		
		if(member.getMe_gender() != 'M' && member.getMe_gender() != 'F')
			return false;
		
		if(member.getMe_birth() == null)
			return false;
		
		MemberVO dbMember = memberDao.selectMember(member.getMe_id());
		// 이미 가입된 아이디이면
		if(dbMember != null)
			return false;
		
		// 비밀번호 암호화
		String encodePw = passwordEncoder.encode(member.getMe_pw());
		member.setMe_pw(encodePw);
		
		memberDao.insertMember(member);
		return true;
	}

	@Override
	public MemberVO login(MemberVO member) {
		if(member == null || member.getMe_id() == null)
			return null;
		
		MemberVO dbMember = memberDao.selectMember(member.getMe_id());
		// 가입된 아이디가 아니면
		if(dbMember == null)
			return null;
		// 아이디, 비밀번호가 일치하는 경우
		// matches(암호화 안된 비밀번호, 암호화 된 비밀번호)
		if(passwordEncoder.matches(member.getMe_pw(), dbMember.getMe_pw()))
			return dbMember;
		// 아이디는 있지만 비밀번호가 다른 경우
		return null;
	}

	@Override
	public boolean checkId(MemberVO member) {
		if(member == null || member.getMe_id() == null)
			return false;
		MemberVO user = memberDao.selectMember(member.getMe_id());
		if(user != null)
			return false;
		return true;
	}

	@Override
	public ArrayList<String> getIdList(MemberVO member) {
		if(member == null)
			return null;
		return memberDao.selectIdList(member);
	}

	@Override
	public void sendEmail(String title, String content, String email) {
		String setfrom = "stajun@naver.com";         
	    
	    try {
	        MimeMessage message = mailSender.createMimeMessage();
	        MimeMessageHelper messageHelper 
	            = new MimeMessageHelper(message, true, "UTF-8");

	        messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
	        messageHelper.setTo(email);     // 받는사람 이메일
	        messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
	        messageHelper.setText(content);  // 메일 내용

	        mailSender.send(message);
	    } catch(Exception e){
	        System.out.println(e);
	    }
	}

	@Override
	public boolean findPw(MemberVO member) {
		if(member == null || member.getMe_email() == null || member.getMe_birth() == null) {
			return false;
		}
		
		MemberVO dbMember = memberDao.selectMemberByEmailBirth(member);
		
		if(dbMember == null) {
			return false;
		}
		
		// 임시 비밀번호 발급 - 랜덤 8자, 영문, 숫자
		String newPw = "";
		int max = 8;
		for(int i = 0; i<max; i++) {
			int r = (int)(Math.random()*62);
			// r : 0~9 => 숫자, 10~35 => 소문자, 36~61 => 대문자
			if(r <= 9) {
				newPw += r;
			}else if(r <= 35) {
				newPw += (char)('a' + r - 10);
			}else {
				newPw += (char)('A' + r - 36);
			}
		}
		/*
		String charaters= "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i<max; i++) {
			int r = (int)(Math.random()*62);
			newPw += charaters.charAt(r);
		}
		*/

		//임시 비밀번호를 등록된 이메일로 전송
		sendEmail("임시 비밀번호", newPw , member.getMe_email());
		//새 비밀번호를 회원 정보에 저장(암호화)
		String encPw = passwordEncoder.encode(newPw);
		dbMember.setMe_pw(encPw);
		memberDao.updateMember(dbMember);
		return true;
	}


}