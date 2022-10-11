package com.example.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController2 {
	
	@PostMapping("/post")
	public String demoPost( 
			@RequestParam String membername,	//@RequestParam("membername") << 괄호부분 안해도 자동매칭이 되는구나 (html의 name과 일치) 혹시 Get방식도 마찬가지인가? > X, Get은 다름.
			@RequestParam String memberid,
			@RequestParam String memberemail,			
//			@RequestBody String req,
			Model model ) {
		
		model.addAttribute("membername", membername);
		model.addAttribute("memberid", memberid);
		model.addAttribute("memberid", memberemail);
//		model.addAttribute("req", req);
		/**
		 * @RequestBody는 전달된 데이터를 일괄로 묶어서 출력.
		 * 만약 Post 방식으로 전달한 폼(Form) 데이터들에 대해서 개별적으로 받고자 한다면?
		 * 
		 * Get 방식 --> @GetMapping		: @RequestParam
		 * Post 방식 -> @PostMapping		: @RequestBody, @RequestParam
		 */
		
//		System.out.println("성공");
//		System.out.println(req);
		
		return "/post/post";	//post.html
		
		/**
		 * 현재 위 상태만으로는 뷰페이지쪽에서는 전달된 값이 아무것도 출력되지 않음.
		 * 이유는 Model model을 통해서 뷰페이지로 전달.
		 */
	}

}
