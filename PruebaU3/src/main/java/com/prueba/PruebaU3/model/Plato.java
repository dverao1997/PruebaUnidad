package com.prueba.PruebaU3.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "plato")
public class Plato {
    private String nombrePlato;
    private String descripcion;
    private Double precio;

}
