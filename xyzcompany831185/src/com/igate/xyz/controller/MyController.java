package com.igate.xyz.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



import com.igate.xyz.bean.Login;
import com.igate.xyz.bean.MovementReqDetails;
import com.igate.xyz.exception.XyzException;
import com.igate.xyz.service.IXyzService;


@Controller

public class MyController {
	
	@Autowired
	IXyzService xyzservice;
	
	
	@RequestMapping(value="/showLogin")
	public String showForm(Model model)
	{
		
	  model.addAttribute("login", new Login());
	  return "login";
	}
	
	@RequestMapping(value="/processLogin")
	public String processLoginForm(@ModelAttribute("login")@Valid Login login,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "login";
		}
	  String username=login.getUserName();
	  String password=login.getPassword();
	  System.out.println("*******************"+username);
	  model.addAttribute("username",username);
	  model.addAttribute("password",password);
	  if("igate".equals(username)&& "global".equals(password))
	  {
		 
		  return "home";
	  }
	  else
	  {
	  return "failure";
	  }
	}
	
	
	
	@RequestMapping(value="/addmr")
	public String addTrainee(Model model)
	{
	
		model.addAttribute("movement", new MovementReqDetails());
		return "movement";
		
	}
	
	@RequestMapping(value="/processAddmr")
	public String processAddForm(@ModelAttribute("movement")@Valid MovementReqDetails movement,BindingResult result,Model model)
	{
		
		if(result.hasErrors())
		{
			return "movement";
		}
	 
		else
		{ 
			
			
			int es;
			try {
				es = xyzservice.addMR(movement);
			} catch (XyzException e) {
				// TODO Auto-generated catch block
				model.addAttribute("exception", e.getMessage());
				return "exception";
				
			}
			
			
			model.addAttribute("result",movement);
			return "result";
			
		}
		
		  
	  
	  
	}
	
	@RequestMapping(value="/redirect")
	public String move(Model model)
	{
	
		model.addAttribute("movement", new MovementReqDetails());
		return "home";
		
	}
	
	@RequestMapping(value="/display")
	public String display(Model model)
	{
	
		model.addAttribute("displayselect", new MovementReqDetails());
		return "displayselect";
		
	}
	
	@RequestMapping(value="/processretreve")
	public String displayselected(@ModelAttribute("displayselect")@Valid MovementReqDetails displayselect,BindingResult result,Model model)
	{
		String empid;
		List<MovementReqDetails> movement=new ArrayList<MovementReqDetails>();
		try {
			 empid=displayselect.getEmpId();
			movement=xyzservice.displayselected(displayselect);
		} catch (XyzException e) {
			// TODO Auto-generated catch block
			model.addAttribute("exception", e.getMessage());
			return "exception";
		}
		if(movement.isEmpty())
		{
			model.addAttribute("display1", empid);
			return "empty";
		}
		else
		{
			model.addAttribute("display1", empid);
		model.addAttribute("display", movement);
		return "displayallmrs";
		}
			
		
		
		  
	  
	  
	}
	
	@ExceptionHandler(java.lang.Exception.class)	
	public ModelAndView handleException(HttpServletRequest request,Exception ex)
	{
		
		ModelAndView model=new ModelAndView();
		model.addObject("url",request.getRequestURL());
		model.addObject("exception",ex);
		model.setViewName("error");
		return model;
	}
	}
	
	

