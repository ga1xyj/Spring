package com.yedam.java.emp.web;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

//JSP 페이지를 만들 수 있는 컨트롤러


@Controller
public class EmpController {
//외부에 있는 맵퍼
	
	@Autowired
	EmpMapper empMapper;
	
	@GetMapping("/emp")
	//경로를 통해 맵핑
	public String emp(Model model, EmpVO empVO) {
		EmpVO findVO = empMapper.getEmp(empVO);
		model.addAttribute("emp", findVO);
		return "emp";
	}
	
//	public String method(HttpRequest res, HttpResponse rs) {
//		
//	}
}
