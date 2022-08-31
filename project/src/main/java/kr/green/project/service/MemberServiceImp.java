package kr.green.project.service;

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
}
