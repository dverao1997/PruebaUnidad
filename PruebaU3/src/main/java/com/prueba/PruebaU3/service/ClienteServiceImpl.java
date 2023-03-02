package com.prueba.PruebaU3.service;

import com.prueba.PruebaU3.model.Cliente;
import com.prueba.PruebaU3.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente,Long> implements  ClienteService{
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return clienteRepository;
    }
}
