package com.springsample.service;

import java.util.List;

import com.springsample.vo.EmployeeVO;

public interface EmployeeService {
	List<EmployeeVO> getAllEmployees();
	EmployeeVO getEmployee(String id);
	int addEmployee(EmployeeVO employee);
	int updateEmployee(EmployeeVO employee);
}
