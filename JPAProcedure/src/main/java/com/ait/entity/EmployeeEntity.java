package com.ait.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
@NamedStoredProcedureQuery(
		name = "proce1",
		procedureName = "EMP_EXPERIENCE",
		parameters= {
				@StoredProcedureParameter(mode= ParameterMode.IN, type = Integer.class, name = "ENO"),
				@StoredProcedureParameter(mode= ParameterMode.OUT, type = String.class, name = "NAME"),
				@StoredProcedureParameter(mode= ParameterMode.OUT, type = Double.class, name = "EXPERIENCE"),
		}
		
		)
public class EmployeeEntity {
	
	@Id
	@Column(name="empno")
	private Integer empNumber;
	
	@Column(name="ename")
	private String empName;
	
	@Column(name="sal")
	private Double salary;
	
	@Column(name="deptno")
	private Integer deptNumber;

	public Integer getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(Integer empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(Integer deptNumber) {
		this.deptNumber = deptNumber;
	}
}
