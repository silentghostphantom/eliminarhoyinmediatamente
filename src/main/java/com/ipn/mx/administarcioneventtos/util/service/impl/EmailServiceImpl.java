package com.ipn.mx.administarcioneventtos.util.service.impl;

import com.ipn.mx.administarcioneventtos.util.service.EmailService;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import java.io.File;

@Service
public class EmailServiceImpl implements EmailService {

  @Autowired
  JavaMailSender mailSender;

  @Value("classpath:static/diccionarioDatos26_1.pdf")
  Resource resourceFile;
  @Override
  public void enviarCorreo(String to, String subject, String text) {
    MimeMessage message = mailSender.createMimeMessage();
    MimeMessageHelper messageHelper;
    try{
      messageHelper = new MimeMessageHelper(message,true,"UTF-8");
      messageHelper.setFrom(new InternetAddress("noreply@gmail.com","Administracion de Eventos"));
      messageHelper.addAttachment("archivo", new File(resourceFile.getFile().toURI()));
      messageHelper.setSubject(subject);
      messageHelper.setText(text);
      messageHelper.setTo(to);
      messageHelper.setBcc(new InternetAddress("chipymanolo@gmail.com"));
      messageHelper.setCc(new InternetAddress("ale120201@gmail.com"));
      mailSender.send(message);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }



}

