package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceBonjourFTG implements ServiceBonjour {

  @Override
  public String bonjour() {
    return "Salut wow t'as les seins qui pointent aujoud'hui c'est le printemps ou quoi ?";
  }
}
