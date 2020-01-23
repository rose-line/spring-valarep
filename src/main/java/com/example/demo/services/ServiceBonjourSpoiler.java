package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceBonjourSpoiler implements ServiceBonjour {

  @Override
  public String bonjour() {
    return "Salut t'as vu le massacre au mariage de Robb hier trop dégoûté purée quelle ordure ce Frey !";
  }
}
