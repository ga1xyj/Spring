package com.yedam.java.emp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class EmpTest {
	@Autowired
	EmpMapper empMapper;
	
	
	//전체조회
	public void empListTest() {
		List<EmpVO> findList = empMapper.getEmpList();
		for(EmpVO findVO : findList) {
			System.out.println(findVO.getLastName());
		}
	}
	@Test
	//단건조회
	public void empInfoTest() {
		EmpVO info = new EmpVO();
		info.setEmployeeId("149");
		EmpVO findVO = empMapper.getEmp(info);
		assertNotNull(findVO.getEmail());
	}
	
	//등록
	public void empInsertTest() {
		EmpVO info = new EmpVO();
		info.setFirstName("수빈");
		info.setLastName("윤");
		info.setEmail("love");
		info.setJobId("IT_PROG");
		info.setSalary("99999");
		empMapper.insertEmp(info);
		assertEquals(info.getEmployeeId(), "45500");
	}
	
	//@Test
	public void empUpdateSalaryTest() {
		int result = empMapper.updateSalary(207);
		assertEquals(result, 1);
		//1이 맞는지 확인
	}
	
	//@Test
	public void empUpdateInfo() {
		EmpVO info = new EmpVO();
		info.setFirstName("은영");
		//info.setLastName("주");
		info.setEmail("eun");
		info.setEmployeeId("207");
		int result = empMapper.updateEmp(info);
		assertEquals(result, 1);
	}
}
