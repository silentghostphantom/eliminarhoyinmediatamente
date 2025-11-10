package com.ipn.mx.administarcioneventtos.util.service;

public interface EmailService {
  public void enviarCorreo(String to, String subject, String text);
}
