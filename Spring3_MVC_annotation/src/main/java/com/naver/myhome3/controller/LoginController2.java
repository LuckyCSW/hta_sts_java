package com.naver.myhome3.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.naver.myhome3.model.BbsBean;

/*
 *  1. @Controller 애노테이션을 사용한 컨트롤러 클래슬르 이용해서 특정 요청 URL을 처리합니다.
 	2. @Component를 상속한 @Controller는 @Controller가 붙은 클래스의 객체를 메모리에 생성하는 기능을 제공합니다.
 	3. 단순히 객체를 생성하는 것에 그치지 않고 DispatcherServlet이 인식하는 Controller객체로 만들어 줍니다.
 	4. 스프링 컨테이너는 @Controller가 선언된 객체를 자동으로 COntroller 객체로 인식합니다.
 */
@Controller
public class LoginController2 {
	/*
	 1. @RequestMapping 애노테이션을 사용해서 메소드에 처리할 요청 경로를 지정합니다.
	 	value="요청 경로", method는 전송 방식 지정합니다.
	 
	 2. @RequestMapping 뒤에는 반드시 메소드가 나와야 하고 자동 호출 됩니다.
	 
	 3. 메소드 이름은 다른 메소드들과 중복되지 않게만 작성합니다.
	 
	 4. post방식과 get방식을 모두 적용할 경우에는
	 	method={RequestMethod.POST, RequestMethod.GET} 또는 생략합니다.
	 */
	//http://localhost:8088/myhome3/login
	@RequestMapping(value = "/login2", method = RequestMethod.GET)
	public String login2() {
		return "login/loginForm2"; //WEB-INF/views/login/loginForm2.jsp 이곳으로 이동해라
	}
	
	@RequestMapping(value = "/login_ok2.do", method = RequestMethod.POST)
	public String login_ok2(BbsBean bbs) {
		return "login/list2"; 
	}
	
	
	
}
