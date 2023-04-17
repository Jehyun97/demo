package com.khj.exam.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.khj.exam.demo.repository.MemberRepository;
import com.khj.exam.demo.vo.MemberVO;

@Service
public class MemberService {
	private MemberRepository memberRepository;
	
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository=memberRepository;
	}
	public void MemberRegist(MemberVO member) {
		memberRepository.MemberRegist(member);
	}
	public MemberVO getMember(String id) {
		MemberVO member=memberRepository.getMember(id);
		return  member;
		
	}
	public List<MemberVO> getMembers(){
		List<MemberVO> memberlist=memberRepository.getMembers();
		return memberlist;
	}
	
	
	
}
