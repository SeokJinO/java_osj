package kr.green.springtest.service;

import kr.green.springtest.vo.MemberVO;

public interface MemberService {

	public String getEmail(String string);

	public boolean signup(MemberVO member);

}
