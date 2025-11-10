package com.ipn.mx.administarcioneventtos.features.evento.service.impl;

import com.ipn.mx.administarcioneventtos.core.domain.Evento;
import com.ipn.mx.administarcioneventtos.features.evento.repository.EventoRepository;
import com.ipn.mx.administarcioneventtos.features.evento.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.ByteArrayInputStream;
import java.util.List;

@Service
public class EventoServiceImpl implements EventoService {
  @Autowired
  private EventoRepository eventoRepository;

  @Override
  @Transactional(readOnly = true)
  public List<Evento> findAll() {
    return eventoRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Evento findById(Long id) {
    return eventoRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public Evento save(Evento evento) {
    return eventoRepository.save(evento);
  }

  @Override
  @Transactional
  public void delete(Long id) {
      eventoRepository.deleteById(id);
  }

  @Override
  @Transactional(readOnly = true)
  public ByteArrayInputStream reportePDF(List<Evento> listaEventos) {
    //Este método les toca a ustedes utilizando itextpdf
    return null;
  }
}
