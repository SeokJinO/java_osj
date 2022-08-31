package kr.green.springtest.service;

import java.util.ArrayList;
import java.util.Date;

import kr.green.springtest.vo.MemberVO;

public interface MemberService {

	public boolean signup(MemberVO member);

	public MemberVO login(MemberVO member);

	public Object idCheck(MemberVO member);

	public ArrayList<String> getIdList(MemberVO member);

	public boolean sendMail(String title, String content, String email);

	public boolean findPw(MemberVO member);

	public boolean updateMember(MemberVO member, MemberVO user);

	public void updateMemberSession(String me_id, String id, Date session_limit);



}
