package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.dao.AthleteDaoImpl;
import com.manipal.model.Athlete;
import com.manipal.service.AthleteServiceImpl;

@Controller
public class AthleteController {
	
	//Forms
	@RequestMapping(value="/athleteform")
	public String athleteForm() {
		return "form";
	}
	
	@RequestMapping(value="/deleteform")
	public String deleteAthlete() {
		return "delform";
	}
	
	@RequestMapping(value="/updateform")
	public String updateAthlete() {
		return "upform";
	}
	
	//JDBC
	@Autowired
	AthleteServiceImpl athleteService;
	
	@RequestMapping(value="/addAthlete", method=RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute Athlete athlete) {	//fields in the form and the bean class have to match
		int id = athleteService.addAthlete(athlete);
		return new ModelAndView("success","status","Athlete added successfully and the Athlete ID is "+id);
	}
	
	@RequestMapping(value="/showAthletes")
	public ModelAndView getUsers() {
		List<Athlete> userList = athleteService.getAllAthletes();
		return new ModelAndView("athdetails","athlist",userList);
	}
	
	@RequestMapping("/getAthlete")
	public ModelAndView getAthlete(@RequestBody String id) {
		Athlete user = athleteService.getAthlete(id);
		if (user != null)
			return new ModelAndView("changes","athlete",user);
		else
			return new ModelAndView("success","status","Athlete ID not found");
	}
	
	@RequestMapping("/updateAthlete")
	public ModelAndView updateAthlete(@ModelAttribute Athlete athlete) {
		//athlete.setId(1001);
		String status = athleteService.updateAthlete(athlete);
		return new ModelAndView("success","status",status);
	}
	
	@RequestMapping(value="/deleteAthlete")
	public ModelAndView deleteUser(@ModelAttribute Athlete athlete) {
		String status = athleteService.deleteAthlete(athlete);
		return new ModelAndView("success","status",status);
	}
	
	
}
