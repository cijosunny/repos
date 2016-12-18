package com.springsample.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springsample.vo.EmployeeVO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	List<EmployeeVO> employees = new ArrayList<>();

	@Override
	public List<EmployeeVO> getAllEmployees() {
		return employees;
	}

	@Override
	public EmployeeVO getEmployee(String id) {
		EmployeeVO employeeVO = null;
		for (EmployeeVO employee : employees) {
			if(employee.getId().equalsIgnoreCase(id)){
				employeeVO = employee;
				break;
			}
		}
		return employeeVO;
	}

	@Override
	public int addEmployee(EmployeeVO employee) {
		employee.setId("100"+(employees.size()+1));
		if(employees.add(employee))
			return 1;
		else
			return 0;
	}

	@Override
	public int updateEmployee(EmployeeVO employee) {
		int flag = 0;
		for (EmployeeVO emp : employees) {
			if(emp.getId().equalsIgnoreCase(employee.getId())){
				emp.setFirstName(employee.getFirstName());
				emp.setLastName(employee.getLastName());
				emp.setDeptNo(employee.getDeptNo());
				flag = 1;
				break;
			}
		}
		return flag;
	}

}
