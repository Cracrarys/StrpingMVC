package com.adaming.myapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.myapp.entity.Etudiant;

@Repository
public class EtudiantDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void AjoutEtudiant(Etudiant etd) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(etd);
		s.getTransaction().commit();
		s.close();
	}
	
	public void SupprimerEtudiant(Etudiant etd) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.delete(etd);
		s.getTransaction().commit();
		s.close();
	}
	
	public Etudiant GetById(long id) {
		Session s = sessionFactory.openSession();
		Etudiant etu = (Etudiant) s.get(Etudiant.class, id);
		return etu;
	}
	
	@SuppressWarnings("unchecked")
	public List<Etudiant> GetAllEtudiant() {
		Session s = sessionFactory.openSession();
		List<Etudiant> lst = new ArrayList<Etudiant>();
		Criteria crit = s.createCriteria(Etudiant.class);
		lst = crit.list();
		s.close();
		return lst;
	}
	
}
