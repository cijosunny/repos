package com.springsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView landingPage(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("landingPage");
		mv.addObject("msg", "This is landingpage");
		
		return mv;
	}
}
