package kr.green.project.dao;

import org.apache.ibatis.annotations.Param;

import kr.green.project.vo.MemberVO;

public interface MemberDAO {

	MemberVO selectMember(@Param("me_id")String me_id);


	MemberVO insertMember(@Param("m")MemberVO member);
	
}
