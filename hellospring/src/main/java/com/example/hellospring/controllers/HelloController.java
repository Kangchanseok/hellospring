package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//@Controller("myController")
@Controller
public class HelloController {

	// 메서드가 /hello URL요청에 반응하도록 한다
	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam String name	) {
		// 서블릿에서 getParameter로 해준 것을
		// requestParam이 대신 해준거
		ModelAndView mav = new ModelAndView();
		// 객체 추가: 서블릿애서 andAttribute의 역할
		mav.addObject("message", // 키
				"hello, " + name); // 값
		// 뷰파일ㅇ열 은결: 서블릿에서 ReqeustDispatcher로 포워드 한 것과 비슷
		mav.setViewName("/Web-INF/views/hello.jsp");
		
		return mav;
		
	}
	
	
	
	
}
