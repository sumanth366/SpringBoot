package com.sumanth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sumanth.dao.AlienRepo;
import com.sumanth.model.Alien;

@Controller
public class LoginController {
	
	@Autowired
	AlienRepo repo;
	
	
	@RequestMapping("/addAlien")
	public ModelAndView addAlien(Alien a)
	{
		ModelAndView mv= new ModelAndView("home.jsp");
		mv.addObject(a);
		repo.save(a);
		return mv;
	}
	
	@RequestMapping("login")
	public ModelAndView login(@RequestParam int id)
	{
		ModelAndView mv= new ModelAndView("home.jsp");
		Alien a = repo.findById(id).orElse(new Alien());
		mv.addObject(a);
		return mv;
	}

}
