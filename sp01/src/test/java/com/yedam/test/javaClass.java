package com.yedam.test;

import org.junit.Test;

import com.yedam.java.SamsungTV;
import com.yedam.java.TV;

public class javaClass {
	@Test
	public void javaTest() {
		TV tv = new SamsungTV();
		tv.on();
	}
	@Test
	public void method() {
		System.out.println("단순 테스트");
	}
}
