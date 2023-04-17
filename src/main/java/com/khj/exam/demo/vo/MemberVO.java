package com.khj.exam.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberVO {


	private String id;
	private String pwd;
	private String name;
	private String nic;
	private String phone;
	private String email;
}
