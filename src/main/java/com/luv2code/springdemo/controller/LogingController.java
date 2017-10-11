package com.luv2code.springdemo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogingController {

	@RequestMapping(value = "/login", method = { RequestMethod.GET })
	public ModelAndView login(@RequestParam(value = "name") String name, @RequestParam("pass") String pass,
			ModelAndView model) {

		/*
		 * if (name.equals("admin") && (pass.equals("admin"))) {
		 * model.setViewName("admin-list-customer"); return model; }
		 * 
		 * if (name.equals("client") && (pass.equals("client"))) {
		 * model.setViewName("client-list-customers"); return model; }
		 * 
		 * else { model.setViewName("index.jsp"); return model; }
		 */
		model.setViewName("login");
		return model;
	}
}
