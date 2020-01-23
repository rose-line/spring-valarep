package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceBonjourInformel implements ServiceBonjour {

  @Override
  public String bonjour() {
    return "Wesh frère bien ou bien ?";
  }
}
