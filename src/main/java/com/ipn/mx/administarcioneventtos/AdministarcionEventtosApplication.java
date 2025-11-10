package com.ipn.mx.administarcioneventtos;

import com.ipn.mx.administarcioneventtos.util.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdministarcionEventtosApplication implements CommandLineRunner {


  @Override
  public void run(String... args) throws Exception {
    System.out.println("Estoy trabajando");
  }

  public static void main(String[] args) {
    SpringApplication.run(AdministarcionEventtosApplication.class, args);
  }


}
