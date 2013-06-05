package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.GeekService;
import model.Geek;

@Controller
@RequestMapping("/Geeks")
public class GeekController {
	
	@Autowired
	private GeekService geekService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView getSpecatcle(@PathVariable("id") long id) {
		ModelAndView list = new ModelAndView("Geek");
		Geek geek = geekService.getGeekById(id);
		list.addObject("geek", geek);
		return list;
	}
}
