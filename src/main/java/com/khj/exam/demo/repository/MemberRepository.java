package com.khj.exam.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.khj.exam.demo.vo.MemberVO;

@Mapper
public interface MemberRepository {
	
	public String getLastRegistId();
	
	public MemberVO getMember(@Param("id")String id);
	
	public void MemberRegist(@Param("member")MemberVO member);
	
	public List<MemberVO> getMembers();
	
	
	

}
