package com.springsample.dao;

import java.util.List;

import com.springsample.vo.EmployeeVO;

public interface EmployeeDAO {
	List<EmployeeVO> getAllEmployees();
	EmployeeVO getEmployee(String id);
	int addEmployee(EmployeeVO employee);
	int updateEmployee(EmployeeVO employee);
}
