package com.prueba.PruebaU3.repository;

import com.prueba.PruebaU3.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, Long> {
}
