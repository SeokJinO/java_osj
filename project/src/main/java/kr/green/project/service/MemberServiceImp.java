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
	public void login(MemberVO member) {
		// TODO Auto-generated method stub
		
	}
}
