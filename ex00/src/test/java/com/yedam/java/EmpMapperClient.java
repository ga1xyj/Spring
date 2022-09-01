package com.yedam.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;
		//maven 업데이트
@RunWith(SpringJUnit4ClassRunner.class)
//테스트 실행하는 클래스 변경
	//addLibrary - jUnit4
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
//어느 xml 참고할 건지
public class EmpMapperClient {
	@Autowired
	EmpMapper empMapper;
	
	@Test
	public void getEmp() {
		EmpVO vo = new EmpVO();
		vo.setEmployeeId("100");
		EmpVO findVO = empMapper.getEmp(vo);
		System.out.println(findVO.getLastName());
		assertEquals(findVO.getLastName(), "King");
		
	}
}
