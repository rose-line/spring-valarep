package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceBonjourImpl implements ServiceBonjour {

  @Override
  public String bonjour() {
    return "Salut tertous !";
  }
}
