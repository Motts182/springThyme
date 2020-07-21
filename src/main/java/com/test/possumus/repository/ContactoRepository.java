package com.test.possumus.repository;

import com.test.possumus.model.Contacto;
import org.springframework.data.repository.CrudRepository;

public interface ContactoRepository  extends CrudRepository<Contacto, Long> {
}
