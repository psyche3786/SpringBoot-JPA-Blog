package com.lth.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.lth.blog 패키지 이하를 스캔해서 모든 파일을 메모리에  new 하는 것은 아님.
//특정 어노테이션이 붙어 있는 클래스 파일들을 new해서(Ioc) 스프링 컨테이너에 관리해준다.
@RestController 
public class BlogControllerTest {

	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>Hello Spring Boot</h1>";
	}
	
}
