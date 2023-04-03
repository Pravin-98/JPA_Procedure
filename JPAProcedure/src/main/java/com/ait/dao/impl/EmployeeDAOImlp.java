package com.ait.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import com.ait.dao.EmployeeDAO;

public class EmployeeDAOImlp implements EmployeeDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	
	@Override
	public void executeProcedure(int empno) {
		
		EntityManager em = factory.createEntityManager();
		StoredProcedureQuery query = em.createNamedStoredProcedureQuery("proce1");
		query.setParameter("ENO", empno);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		query.execute();
		
		String s1 = (String)query.getOutputParameterValue("NAME");
		Double exp = (Double)query.getOutputParameterValue("EXPERIENCE");
		
		System.out.println("Name ::" + s1);
		System.out.println("Experience :: "+ exp);
		
		tx.commit();
		em.close();
		factory.close();

	}

}
