package com.example.demo.Restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entiy.Captc;
import com.example.demo.repository.Repos;
import com.example.demo.service.UserserviceImp;
import com.example.demo.utill.Captchautill;

import cn.apiclub.captcha.Captcha;

@org.springframework.stereotype.Controller 

public class Controller {
  @Autowired
  UserserviceImp userserviceImp;
	@Autowired
	private Repos repos;
	
	@RequestMapping("/register")
	public String registeruser(Model model) {
		Captc captc=new Captc();
		getCaptcha(captc);
		model.addAttribute("captc", captc);
		return "registeruser";
	}
	
	
	@RequestMapping("/allUsers")
	public String getlluser(Model model) {
		List<Captc> userList=userserviceImp.getAllCaptc();
		model.addAttribute("userList", userList);
		return "listuser";
	}
	
	@RequestMapping("/save")
	public String saveuser(@ModelAttribute Captc captc,Model model) {
		if (captc.getCaptcha().equals(captc.getHiddenCaptcha())) {
			userserviceImp.createUser(captc);
			model.addAttribute("message", "user registered successfully.");
		    return "redirect:allUsers";
		}else {
			model.addAttribute("message", "Invalid captch");
			getCaptcha(captc);
			model.addAttribute("captc",captc );
		}
	
	  return "registeruser";
	}
	
	
	
	public void getCaptcha(Captc captc) {
		// TODO Auto-generated method stub
	Captcha captcha=Captchautill.createCaptcha(240, 70);
	captc.setHiddenCaptcha(captcha.getAnswer());
	captc.setCaptcha(""); //user entered value
	captc.setRealCaptcha(Captchautill.encodecaptcha(captcha));
	
	}
	
}
