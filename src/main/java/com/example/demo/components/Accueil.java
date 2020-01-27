package com.example.demo.components;

import com.example.demo.services.ServiceBonjour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ch.qos.logback.core.joran.spi.NoAutoStart;

@Component
public class Accueil {

  @Autowired
  @Qualifier("serviceBonjourInformel")
  private ServiceBonjour serviceBonjour;

  @Autowired
  private ServiceBonjour serviceBonjourSpoiler;

  private ServiceBonjour serviceBonjourGrosRelou;

  @Autowired
  public Accueil(@Qualifier("serviceBonjourFTG") ServiceBonjour serviceBonjour) {
    serviceBonjourGrosRelou = serviceBonjour;
  }

  public String direBonjour() {
    return serviceBonjour.bonjour()
        + "\n" + serviceBonjourSpoiler.bonjour()
        + "\n" + serviceBonjourGrosRelou.bonjour();

  }
}
