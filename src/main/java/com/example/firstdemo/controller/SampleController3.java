package com.example.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * 스프링부트 객체 전달 (userDTO 객체 사용)
 */

@Controller
public class SampleController3 {
	
	@PostMapping("/SampleController3")
	public String userForm( String userName, String userId, String userPhone ) {	//이렇게도 작성 합니다~
//			@RequestParam String userName,
//			@RequestParam String userId,
//			@RequestParam String userPhone) {
		
		System.out.println("---------------------------------------");
		System.out.println(userName);
		System.out.println(userId);
		System.out.println(userPhone);
		System.out.println("---------------------------------------");
		
		return "/post/SampleController3View";
		
	}
	
	

}
