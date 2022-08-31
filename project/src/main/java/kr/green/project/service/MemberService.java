package kr.green.project.service;

import kr.green.project.vo.MemberVO;

public interface MemberService {

	public MemberVO login(MemberVO member);

	public MemberVO signUp(MemberVO member);
}
