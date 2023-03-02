package com.prueba.PruebaU3.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "cliente")
public class Cliente {
    private  Long id;
    private String nombre;
    private String cedula;
    private String correo;

    private List<Restaurante> listaRestaurante;
}
