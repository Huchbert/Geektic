package geektic.controller;

import java.util.List;

import geektic.model.Geek;
import geektic.service.GeekService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Geeks")
public class GeekController {
	
	@Autowired
	private GeekService geekService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView result = new ModelAndView("Geeks"); // Geek.jsp
		List<Geek> geeks = geekService.findAll();
		result.addObject("geeks", geeks);
		return result; // Retourne le résultat dans la variable geeks de Geeks.jsp
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView getSpecatcle(@PathVariable("id") long id) {
		ModelAndView result = new ModelAndView("Geek"); // Geek.jsp
		Geek geek = geekService.getGeekById(id);
		result.addObject("geek", geek); 
		return result; // Retourne le résultat dans la variable geek de Geek.jsp
	}
}
