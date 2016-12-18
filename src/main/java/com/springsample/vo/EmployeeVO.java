package com.springsample.vo;

public class EmployeeVO {
	private String id;
	private String firstName;
	private String lastName;
	private String deptNo;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	
	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", deptNo=" + deptNo
				+ "]";
	}
	
}
