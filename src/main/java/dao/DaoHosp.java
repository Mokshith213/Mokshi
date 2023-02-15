package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Dtohosp;

public class DaoHosp {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insert(Dtohosp  dto)
	{
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
	}
	
}
