package com.yedam.spring;

import org.springframework.stereotype.Component;

@Component("tv")
//자동으로 빈에 등록됨
//이름도 같이 등록
public class SamsungTV implements TV {
	
	public void on() {
		System.out.println("스프링 방식으로(어노테이션)");
	}

}
