package com.yedam.java.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.emp.service.EmpVO;

public interface EmpMapper {
	//전체조회
	public List<EmpVO> getEmpList();
	//단건조회
	public EmpVO getEmp(EmpVO empVO);
	//등록
	public int insertEmp(EmpVO empvo);
	//수정 : 연봉 10% 인상
	public int updateSalary(@Param("empId")int employeeId);
		//결과값 받아오기
		//이름이 다를 경우 param으로
	
	//수정 : 사원정보를 넘겨받아서 이름과 성, 이메일을 수정할 수 있는 메소드
	public int updateEmp(EmpVO empVO);

	
}
