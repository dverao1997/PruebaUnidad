package com.prueba.PruebaU3.controller;

import com.prueba.PruebaU3.model.Cliente;
import com.prueba.PruebaU3.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteservice;
    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listarCliente(){
        return new ResponseEntity<>(clienteservice.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Cliente> crear(@RequestBody Cliente
                                         c){
        return new ResponseEntity<>(clienteservice.save(c),HttpStatus.CREATED);
    }

    @PutMapping("/up/{id}")
    public ResponseEntity<Cliente> act(@PathVariable Long id,@RequestBody Cliente c){
        Cliente cli =clienteservice.findById(id);
        if (clienteservice==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            try{
                cli.setNombre(c.getNombre());
                cli.setCorreo(c.getCorreo());
                return new ResponseEntity<>(clienteservice.save(cli),HttpStatus.OK);
            }catch (DataAccessException e){
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
    @DeleteMapping("/el/{id}")
    public ResponseEntity<Cliente> elidminar(@PathVariable Long id){
        clienteservice.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
