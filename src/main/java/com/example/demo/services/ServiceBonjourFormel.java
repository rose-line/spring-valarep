package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceBonjourFormel implements ServiceBonjour {

  @Override
  public String bonjour() {
    return "Bonjour, comment allez-vous ?";
  }
}
