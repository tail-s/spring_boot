package com.example.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController1 {
	
	@GetMapping("/user/userinfo")
	public String userInfo() {
		
		return "/user/userinfo";
	}
	
	@GetMapping("/user/userdata")
	public String userDate(Model model) {
		
		model.addAttribute("username", "홍길동");
		// 뷰페이지단으로 같이 데이터(model) 전달
		
		return "/user/userinfo";
	}
	
	@GetMapping("/user/userid")
	public String userId( @RequestParam(value = "userid", required = false) String uid, Model model ) {
		
		/**
		 * required=true 옵션은 디폴트가 true이고, 써놓지 않으면 디폴트값으로 true가 적용.
		 * 이 경우에는 반드시 주소창에 userid 파라미터 값을 넣어서 HTTP 요청을 넣어야 한다. 안그러면 페이지 에러가 발생.
		 * http://localhost:8024/user/userid?userid=blahblah
		 * 
		 * 만약, false로 지정을 하면 파라미터 값을 넣지 않고 요청을 해도 페이지 에러가 발생하지 않는다.
		 * true가 기본값. 보통은 @RequestParam("userid")
		 */
		
		model.addAttribute("userid", uid);
		
		return "/user/userinfo";	//userinfo.html
	}
	
	@GetMapping("/user/userparams")
//	public String userParams( @RequestParam(value = "userid") String userid, @RequestParam(value = "username") String username, Model model ) {
//		
//		
//		model.addAttribute("userid", userid);
//		model.addAttribute("username", username);
//		
//		return "/user/userinfo";
//	}
	public String userParams(
			@RequestParam(value = "userid") String uid,
			@RequestParam(value = "username") String uname,
			@RequestParam(value = "useremail") String uemail,
			@RequestParam(value = "userhp", required = false) String uhp,
			Model model ) {
		
		model.addAttribute("userid", uid);
		model.addAttribute("username", uname);
		model.addAttribute("useremail", uemail);
		model.addAttribute("userhp", uhp);
		
		return "/user/userinfo";
	}

}
