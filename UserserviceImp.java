package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entiy.Captc;
import com.example.demo.repository.Repos;
@Service
public class UserserviceImp implements Iuservixe {

	@Autowired
	Repos repos;
	
	
	
	public void createUser(Captc captc) {
		// TODO Auto-generated method stub
      repos.save(captc);
	}

	
	public List<Captc> getAllCaptc() {
		// TODO Auto-generated method stub
	List<Captc> captc	=repos.findAll();
		
		return captc;
	}

	
	public Optional<Captc> getOneUser(Integer id) {
		// TODO Auto-generated method stub
		
		
		
		return repos.findById(id);
	}

}
