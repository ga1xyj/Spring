package com.yedam.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.junit.Restaurant;

@RunWith(SpringJUnit4ClassRunner.class)
//test용이라 실제 프로젝트의 동작과는 다름
//jUnit제공 말고 spring jUnit4classrunner 사용
@ContextConfiguration(locations = "classpath:applicationContext.xml")
//얘를 읽어들이면
public class TestClass {
	//컨테이너에서 바로
	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	Restaurant res;
	
	@Test
	public void beanTest() {
		Restaurant res = ctx.getBean(Restaurant.class);
		res.open();
	}

}
