package com.cts.training.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.training.entity.Registration;
import com.cts.training.service.visitorService;

@Controller
@RequestMapping(value="admin")
public class AdminController {
	@Autowired
	private visitorService service;
@RequestMapping(value="/login.html")
public String loadlogin(Model model) {
	System.out.println("welcome to model view");
	Registration reg=new Registration();
	model.addAttribute("customer",reg);
	return "login-form";
}
	
@RequestMapping(value="/savecustomer.html")
public String loadloginregistration(Model model) {
	System.out.println("welcome to model view");
	Registration regis=new Registration();
	model.addAttribute("customer", regis);
	return "Registration";
}

@RequestMapping(value="/updatepassword.html")
public String newPassword(Model model) {
	
	System.out.println("Welcome to new password modification..");
	Registration regis=new Registration();
	model.addAttribute("newpassword", regis);
	
	return "ChangePassword";
}

@RequestMapping(value="/about.html")
public String aboutPage(Model model) {
	System.out.println("Welcome to the about view");
	//model.addAttribute("about", );
	return "about";
}

@RequestMapping(value="/eventregis.html",method = RequestMethod.POST)
public String eventRegis(@ModelAttribute("customer") Registration reg,Model model) {
	System.out.println("welcome to the registration page..");
//	System.out.println(reg.getUsername());
//	Registration r=service.getRegistration(reg.getId());
	//System.out.println("Controller..."+r.getAddress());
	//System.out.println(r.getUsername());
//	String username=reg.getUsername();
//	String password=reg.getPassword();
//	System.out.println("the username is:"+username);
//	System.out.println("the password is:"+password);
	//List <Registration> list=service.getRegistrationdetails();
	//System.out.println("the value is:"+list.get(0));
   //model.addAttribute("customer", list);
	
	

	
	return "main-form";
//	if(r==null) {
//	List <Registration> regis=service.getRegistrationdetails();
//	model.addAttribute("list",regis);
		
		
//	}
//	else {
//	return "redirect:/admin/login.html";
//	}
//	model.addAttribute("customer",username);
//	boolean b=service.checkCredentials(username, password);
//	if(b) {
//		return "main-form";
//	}
//	else {
//		return "redirect:/admin/login.html";
//	}

}

@RequestMapping(value="/main.html")
public String mainPage(Model model) {
	System.out.println("Welcome to main form:");
	
	
	return "main-form";
}

@RequestMapping(value="/successRegi.html")
public String regisSuccess(@ModelAttribute("customer") Registration r,Model model) {
	System.out.println("Welcome to second model..");
	System.out.println("The details are:");
	System.out.println("The address is:"+r.getAddress());
	System.out.println("The email is:"+r.getEmail());
	System.out.println("The id is:"+r.getId());
	System.out.println("The lastname is:"+r.getLastname());
	System.out.println("The pwd is: "+r.getPassword());
	System.out.println("The username is:"+r.getUsername());
	//service.saveRegis(r);
	//List <Registration> list=service.getRegistrationdetails();
	//System.out.println("the value is:"+list.get(0));
  // model.addAttribute("customers", list);
	//System.out.println("welcome to user:"+r.getUsername());
	return "redirect:/admin/eventregis.html";
}
}
