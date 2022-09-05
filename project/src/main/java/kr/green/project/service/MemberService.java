package kr.green.project.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.green.project.vo.MemberVO;

public interface MemberService {

	public MemberVO login(MemberVO member);

	public MemberVO signUp(MemberVO member);

	public void logout(HttpServletRequest request, HttpServletResponse response);
}
