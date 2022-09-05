package kr.green.project.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.project.dao.MemberDAO;
import kr.green.project.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService {
	
	@Autowired
    MemberDAO memberDao;


	@Override
	public MemberVO login(MemberVO member) {		
		MemberVO dbMember = memberDao.selectMember(member.getMe_id());
			return dbMember;		
	}


	@Override
	public MemberVO signUp(MemberVO member) {
		if(member == null || member.getMe_id() == null || member.getMe_pw() == null)
			return null;
		MemberVO dbMember = (MemberVO)memberDao.insertMember(member);
		return dbMember;
		
	}


	@Override
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		if(request == null || response == null)
			return;
		HttpSession session = request.getSession();
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");
		session.removeAttribute("user");
	}
}
