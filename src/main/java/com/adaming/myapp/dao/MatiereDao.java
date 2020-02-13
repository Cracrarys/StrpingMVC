package com.adaming.myapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.myapp.entity.Matiere;

@Repository
public class MatiereDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void AjoutMatiere(Matiere mat) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(mat);
		s.getTransaction().commit();
		s.close();
	}
	
	public void SupprimerMatiere(Matiere mat) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.delete(mat);
		s.getTransaction().commit();
		s.close();
	}
	
	public Matiere GetById(long id) {
		Session s = sessionFactory.openSession();
		Matiere obj = (Matiere) s.get(Matiere.class, id);
		return obj;
	}
	
	@SuppressWarnings("unchecked")
	public List<Matiere> GetAllMatiere() {
		Session s = sessionFactory.openSession();
		List<Matiere> lst = new ArrayList<Matiere>();
		Criteria crit = s.createCriteria(Matiere.class);
		lst = crit.list();
		s.close();
		return lst;
	}
	
}
