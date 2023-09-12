package com.naver.myhome3.ResponseAttributes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController8 {
	/*
	    * http://localhost:8088/myhome3/first 실행 후
	    * => http://localhost:8088/myhome3/go?attr=addAttribute
	    *    addFlashAttribute로 보낸 데이터 출력하는 방법 :${flash }=addFlashAttribute
	    *      addAttribute로 보낸 데이터 출력하는 방법 : ${param.attr}=addAttribute
	    * => 새로고침
	    *      addFlashAttribute로 보낸 데이터 출력하는 방법 : ${flash }=
	    *    addAttribute로 보낸 데이터 출력하는 방법 : ${param.attr]=addAttribute
	    *    
	    *    addFlashAttribute()는 일회성으로 데이타를 전달합니다.
	*/
	@RequestMapping(value="/first")
	public String first(RedirectAttributes rattr) {
		rattr.addFlashAttribute("flash", "addFlashAttribute");
		rattr.addAttribute("attr", "addAttribute");
		return "redirect:/go"; //redirect로 이동해라
							   //http://localhost:8088/myhome3/go
	}
	
	@RequestMapping(value="/go")
	public String redirect() {
		return "redirect2/go"; //뷰페이지 정보
	}
	
	@RequestMapping(value="/redirectForm")
	public String redirectForm() {
		return "redirect2/loginForm"; 
	}
	
	@RequestMapping(value="/redirect.do")
	public String redirect_idcheck(String id, String pass, RedirectAttributes rattr) {
		int result=1; //아이디 일치하지 않는 경우
		if(id.equals("java") && pass.equals("java")) {
			result=2; //아이디 비번 일치
		}else if(id.equals("java")) {
			result=-1; //비번 잘못된 경우
		}
		
		if(result==-1 || result==1) {
			rattr.addFlashAttribute("result", result); //http://localhost:8088/myhome3/redirect
			//rattr.addAttribute("result", result); //http://localhost:8088/myhome3/redirect?result=1
			return "redirect:redirectForm";
		}
		
		return "redirect2/success";
	}
	
	
	
}
