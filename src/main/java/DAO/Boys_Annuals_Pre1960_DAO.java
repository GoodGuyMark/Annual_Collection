package DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Boys_Annuals_Pre1960;

@Stateless
@LocalBean
public class Boys_Annuals_Pre1960_DAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Boys_Annuals_Pre1960> getBoysAnnualsPre1960(){
		Query query = entityManager.createQuery("SELECT a FROM Boys_Annuals_Pre1960 a");
		return query.getResultList();
	}
}
