package com.naver.myhome3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.myhome3.model.BbsBean;

/*
 *  1. @Controller 애노테이션을 사용한 컨트롤러 클래슬르 이용해서 특정 요청 URL을 처리합니다.
 	2. @Component를 상속한 @Controller는 @Controller가 붙은 클래스의 객체를 메모리에 생성하는 기능을 제공합니다.
 	3. 단순히 객체를 생성하는 것에 그치지 않고 DispatcherServlet이 인식하는 Controller객체로 만들어 줍니다.
 	4. 스프링 컨테이너는 @Controller가 선언된 객체를 자동으로 COntroller 객체로 인식합니다.
 */
@Controller
public class LoginController3 {
	/* command 객체에 접근할 때 사용할 속성 명을 변경하고 싶다면 @ModelAttribute를 사용합니다.
	 	예) @ModelAttribute("hoho") BbsBean bbs
	 		view 페이지에서 "hoho"라는 이름으로 사용하면 됩니다.
	 		
	 		<th>ID</th><td>${hoho.id}</td>
	 
	 */
	@RequestMapping(value = "/login3", method = RequestMethod.GET)
	public String login3() {
		return "login/loginForm3"; 
	}
	
	@RequestMapping(value = "/login_ok3.do", method = RequestMethod.POST)
	public String login_ok3(@ModelAttribute("hoho") BbsBean bbs ) {
		return "login/list3"; 
	}
	
	
	
}
