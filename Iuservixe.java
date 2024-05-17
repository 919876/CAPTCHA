package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entiy.Captc;

public interface Iuservixe {
public   void createUser(Captc captc);
public   List<Captc> getAllCaptc();
  
  public   Optional <Captc> getOneUser(Integer id);
}
