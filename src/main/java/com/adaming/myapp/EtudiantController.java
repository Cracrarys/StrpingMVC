package com.adaming.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.myapp.dao.EtudiantDao;
import com.adaming.myapp.entity.Etudiant;

@Controller
@RequestMapping(value="/")
public class EtudiantController {

	String redirect = "redirect:GetAllEtudiant";
	
	@Autowired
	private EtudiantDao etdDao;
	
	public EtudiantDao getEtdDao() {
		return etdDao;
	}

	public void setEtdDao(EtudiantDao etdDao) {
		this.etdDao = etdDao;
	}
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String init() {
		return redirect;
	}
	
	@RequestMapping(value="/AjoutEtudiant", method=RequestMethod.POST)
	public String ajout(@ModelAttribute("etd") Etudiant etudiant) {
		
		etdDao.AjoutEtudiant(etudiant);
		
		return redirect;
	}
	
	@RequestMapping(value="/SupprimerEtudiant", method=RequestMethod.GET)
	public String supprimerEtudiant(@ModelAttribute("etd") Etudiant etudiant) {
		etdDao.SupprimerEtudiant(etudiant);
		
		return redirect;
	}
	
	@RequestMapping(value="/GetAllEtudiant", method=RequestMethod.GET)
	public String getAllEtudiants(@ModelAttribute("etd") Etudiant etudiant, ModelMap model) {
		
		model.addAttribute("ListeDesEtudiants", etdDao.GetAllEtudiant());
		
		return "etudiant";
	}
	
}
