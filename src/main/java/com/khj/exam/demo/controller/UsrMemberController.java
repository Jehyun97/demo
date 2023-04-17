package com.khj.exam.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khj.exam.demo.service.MemberService;
import com.khj.exam.demo.vo.MemberVO;

@Controller
public class UsrMemberController {

	
	@Autowired
	private MemberService memberService;
	public UsrMemberController(MemberService memberService) { 
		this.memberService=memberService;
	}
	
	@RequestMapping("usr/member/dojoin")
	@ResponseBody
	public String dojoin(String id,String pwd,String name,String nic,String email,String phone) {
	   
		MemberVO member= new MemberVO();
		member.setId(id);
		member.setEmail(email);
		member.setNic(nic);
		member.setPhone(phone);
		member.setName(name);
		member.setPwd(pwd);
		memberService.MemberRegist(member);
		String m= "성공";
		return m;
	}
	@RequestMapping("usr/member/getMembers")
	@ResponseBody
	public List<MemberVO> getMembers(){
		List<MemberVO> memberlist=memberService.getMembers();
		
		return memberlist;
		}
	
}
