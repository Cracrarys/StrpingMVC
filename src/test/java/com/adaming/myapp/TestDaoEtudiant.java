package com.adaming.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;

import com.adaming.myapp.dao.EtudiantDao;
import com.adaming.myapp.entity.Etudiant;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src//test//resources//root-context.xml")
public class TestDaoEtudiant {

	public EtudiantDao getEtdao() {
		return etdao;
	}


	public void setEtdao(EtudiantDao etdao) {
		this.etdao = etdao;
	}


	@Autowired
	private EtudiantDao etdao;
	
	Etudiant etd;
	
	@Before
	public void setUp() {
		etd = new Etudiant();
		etd.setIdEtudiant(5L);
		etd.setNomEtudiant("nomEtudiant5");
		etd.setPrenomEtudiant("prenomEtudiant5");
	}
	
	
	@Test
	public void AjoutEtudiant() {
		etdao.AjoutEtudiant(this.etd);
		Etudiant etdfound = etdao.GetById(5L);
		assertEquals(etd.toString(), etdfound.toString());
	}
	
}
