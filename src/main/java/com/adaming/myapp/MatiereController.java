package com.adaming.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.myapp.dao.MatiereDao;
import com.adaming.myapp.entity.Matiere;

@Controller
@RequestMapping(value="/Matiere")
public class MatiereController {

	String redirect = "redirect:allMatiere";
	
	@Autowired
	private MatiereDao matDao;
	
	public MatiereDao getMatDao() {
		return matDao;
	}

	public void setMatDao(MatiereDao matDao) {
		this.matDao = matDao;
	}

	@RequestMapping(value="/AjoutMatiere", method=RequestMethod.POST)
	public String ajoutMatiere(@ModelAttribute("mat") Matiere matiere) {
		
		matDao.AjoutMatiere(matiere);
		
		return redirect;
	}
	
	@RequestMapping(value="/SupprimerMatiere", method=RequestMethod.GET)
	public String supprimerMatiere(@ModelAttribute("mat") Matiere matiere) {
		
		matDao.SupprimerMatiere(matiere);
		
		return redirect;
	}
	
	@RequestMapping(value="/allMatiere", method=RequestMethod.GET)
	public String getAllMatieres(@ModelAttribute("mat") Matiere matiere, ModelMap model) {
		
		model.addAttribute("listeDesMatieres", matDao.GetAllMatiere());
		
		return "matiere";
	}
	
}
