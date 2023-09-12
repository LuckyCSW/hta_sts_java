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
//@Controller
public class LoginController2_설명 {
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
	
	public String board_write(
			BbsBean bbs	//command 객체
			) {
		/*	command 객체란?
		 *  스프링은 요청 파라미터의 값을 command 객체에 담아주는 기능을 제공합니다.
		 *  command 객체에는 파라미터로 넘어온 값들을 저장할 setter 메소드가 존재하면 됩니다.
		 *  즉, 파라미터의 이름과 property의 이름이 같으면 됩니다.
		 *  예로 loginForm2.jsp에서 <input type=text name=id>에서 입력한 값을 저장하기 위해
		 	setId()메소드가 존재하면 됩니다.
		 *	
		 *	String id=request.getParameter("id");
		 	String pass=request.getParameter("pass");
		 	
		 	BbsBean bbs = new BbsBean();
		 	bbs.setId(id);
		 	bbs.setPass(pass);
		 	
		 	command 객체를 사용하면 이전에 사용되었던 위의 코드들 기능을 하게 되어 필요 없게 됩니다.
		 	
		 	command 객체에 저장된 값을 JSP에서 사용하기 위해서는
		 	${bbsBean.id} 또는 ${bbsBean.pass}로 사용합니다.
		 	 즉, list2.jsp에서
		 	 command 객체의 클래스 이름(첫 글자를 소문자로 바꿉니다)과 동일한 속성 이름을 사용해서 
		 	 command 객체를 뷰에 전달합니다.
		 	 예로 command 객체의 클래스 이름이 BbsBean인 경우 JSP 코드에서는
		 	 command 객체에 접근할 수 있게 됩니다.
		 */
		/*
		 반환형이 String형인 경우 View이름을 리턴합니다.	
		 */
			return "login/list2";
	}
	
	
	
}
