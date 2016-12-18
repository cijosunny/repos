package com.springsample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsample.dao.EmployeeDAO;
import com.springsample.vo.EmployeeVO;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public List<EmployeeVO> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	@Override
	public EmployeeVO getEmployee(String id) {
		return employeeDAO.getEmployee(id);
	}

	@Override
	public int addEmployee(EmployeeVO employee) {
		return employeeDAO.addEmployee(employee);
	}

	@Override
	public int updateEmployee(EmployeeVO employee) {
		return employeeDAO.updateEmployee(employee);
	}

}
