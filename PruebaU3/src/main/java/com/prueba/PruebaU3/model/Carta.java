package com.prueba.PruebaU3.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "carta")
public class Carta {
    private String nombre;
    private String categoria;
    private Integer cantidad;
    private List<Plato> listaPlato;
}
