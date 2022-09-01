package com.yedam.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TV tv = (TV)ctx.getBean(SamsungTV.class);
		//꺼낼 때는 클래스명 또는 빈 이름
		tv.on();
		//new 연산자 사용하지 않음
		//컨텍스트가 빈을 자동으로 생성 -> 클래스 요청 시 넘겨줌
		//코드는 예민함 하나만 건드려도 정상적으로 동작 x
		//컨테이너 이용해서 객체 생성 관리할 때 리스크 줄어듦
	}

}
