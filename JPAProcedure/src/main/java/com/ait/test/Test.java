package com.ait.test;

import com.ait.dao.EmployeeDAO;
import com.ait.dao.impl.EmployeeDAOImlp;

public class Test {

	public static void main(String[] args) {
		
		EmployeeDAO dao = new EmployeeDAOImlp();
		
		dao.executeProcedure(7788);

	}

}
