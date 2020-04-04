package com.cts.training.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.training.entity.Event;
import com.cts.training.entity.People;
import com.cts.training.service.Eventservice;
import com.cts.training.service.visitorService;
@Controller
@RequestMapping(value="visitor")
public class VisitorController {
	@Autowired
	private visitorService service;
	@Autowired
	private Eventservice ser;
	@RequestMapping(value="/savecustomer.html")
	public String loadloginregistration(Model model) {
		System.out.println("welcome to Registration model view");
		People regis=new People();
		model.addAttribute("newvisitor", regis);
		return "Registration";
	}



	@RequestMapping(value="/savedata.html")
	public String registration(@RequestParam("id")int id,Model model) {
		System.out.println("welcome to Registration model view");
		People regis= service.getRegistration(id);
		model.addAttribute("newvisitor", regis);
		return "Registration";
	}



	@RequestMapping(value="/login.html")
	public String loadlogin(Model model) {
		System.out.println("welcome to Login model view");
		People reg=new People();
		//People p=service.getRegistration(id);
		//People reg=service.getRegistration(id);
		model.addAttribute("customer",reg);
		return "login-form";
	}

	
	@RequestMapping(value="/main.html")
	public String mainpage(Model model) {
		System.out.println("welcome to main page..");
		//People p=service.getRegistration(id);
		//model.addAttribute("data", p);
		return "main-form";
	}
	@RequestMapping(value="/eventregis.html",method = RequestMethod.POST)
	public String searchVisitor(@RequestParam("username") String username,@RequestParam("password") String password,Model model) {
		System.out.println("welcome to the main page..");
		System.out.println("username"+username);
		String user,str="false",pass;
		int id;
		List <People> list=service.getDetails();
		//System.out.println(list);
		//List<Event> list2=ser.getEvents();

		List<String> details=new ArrayList<>();
		for(People k:list) {

			user=k.getUsername();


			if(user.equals(username))
			{pass=k.getPassword();
			if(pass.equals(password)) { 
				id=k.getId();
				String mail=k.getEmail();
				String fname=k.getFirstname();
				String lname=k.getLastname();
				String address=k.getAddress();
				str="true";
				//System.out.println("user"+pass);

				details.add(user);
				details.add(mail);
				details.add(fname);
				details.add(lname);
				details.add(address);
				//model.addAttribute("username",user );
				List <Event> list2=ser.getEvents();
				model.addAttribute("eventlist", list2);
				model.addAttribute("id",id);
				System.out.println(details); 

				break;
			} 
			}


		}
		System.out.println(str);
		//model.addAttribute("event", list2);
		if(str=="true") {

			model.addAttribute("details", details);
			return "main-form";}
		else { 
			People p=new People();
			model.addAttribute("customer",p);
			return "login-form";}



	}










	@RequestMapping(value="/successRegi.html")
	public String regisSuccess(@ModelAttribute("newvisitor")@Valid People p,BindingResult result,Model model) {
		String PageName="";
		System.out.println("Welcome to second model..");
		if(result.hasErrors())
		{
			PageName="Registration";
		}
		
		else
		{
			People p1=service.getRegistration(p.getId());
			if(p1!=null) {
				service.updateVisitor(p1.getId(),p);
				
			}
			else
			{
				service.CreateVisitor(p);
			}
			//service.getRegistration(id);
			PageName="redirect:/visitor/login.html";
		}
		return PageName;
	}

	@RequestMapping(value="/about.html")
	public String aboutPage(Model model) {
		System.out.println("Welcome to the about view");
		//model.addAttribute("about", );
		return "about";
	}

	@RequestMapping(value="/updatepassword.html")
	public String newPassword(@RequestParam("id")int id,Model model) {

		System.out.println("Welcome to new password modification..");
		People p2=service.getRegistration(id);
		People regis=new People();
		//model.addAttribute("newpassword", regis);
		//service.UpdatePassword(regis.getId(),regis);
		model.addAttribute("visitor",p2);
		model.addAttribute("id", id);
		model.addAttribute("newpassword", p2);
		return "ChangePassword";
	}

	@RequestMapping(value="/afterchange.html",method = RequestMethod.POST)
	public String updatePassword(@ModelAttribute("newpassword")@Valid People p, BindingResult result,@ModelAttribute("id") int id) {


		System.out.println("welcome to the updatepassword"+id);
		service.UpdatePassword(p.getId(),p);

		return "redirect:/visitor/login.html";

	}

	@RequestMapping(value="/upadate.html")
	public String updatevisitor(Model model)
	{
		People pl=new People();
		model.addAttribute("update", pl);

		return "update-form";
	}
	@RequestMapping(value="/updatedata.html")
	public String visitorupdation(@ModelAttribute("update")People pl)
	{
		//public void updateVisitor(People p);
		//service.updateVisitor(pl.getId());
		System.out.println("The value is"+pl.getAddress());
		return "redirect:/visitor/successRegi.html";
	}

	@RequestMapping(value="/loadevent.html")
	public String loadeventregis(Model model)
	{
		System.out.println("Welcome to event registration");
		Event e=new Event();
		model.addAttribute("event",e);
		return "eventregister";

	}


	@RequestMapping(value="/registeredevent.html")	
	public String eventSuccess(@ModelAttribute("event") Event e,Model model)
	{
		Event e1=ser.regis(e.getId());
		if(e1==null)
		{
			ser.createEvent(e);
		}


		return "redirect:/visitor/login.html";
	}


	@RequestMapping(value="/eventregister.html")
	public ModelAndView catalog()
	{
		List<Event> e=ser.getEvents();
		ModelAndView eve=new ModelAndView("regisfestive");
		eve.addObject("events",e);
		return eve;
	}

	@RequestMapping(value="/register.html")
	public String register(@RequestParam("id") int id) 
	{
		//ModelAndView model=new ModelAndView("regisfestive");
		Event e=ser.regis(id);
		System.out.println("register id"+e);
		int k=e.getAvailableseats();
		System.out.println(k);
		k=k-1;
		e.setAvailableseats(k);
		System.out.println("the seats arer"+k);
		ser.updateEvent(e, id, k);


		return "redirect:/visitor/eventregister.html";
	}
	@RequestMapping(value="/unregister.html")
	public String unregister(@RequestParam("id") int id)
	{
		Event e=ser.regis(id);
		System.out.println("Unregister id"+e);
		int k=e.getAvailableseats();
		System.out.println(k);
		k=k+1;
		e.setAvailableseats(k);
		System.out.println("the seats arer"+k);
		ser.updateEvent(e, id, k);


		return "redirect:/visitor/eventregister.html";
	}	
}
