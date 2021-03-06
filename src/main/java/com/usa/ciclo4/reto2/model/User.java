package com.usa.ciclo4.reto2.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
//setter y getters
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
//Generar la entidad la coleccion
public class User {
    @Id
    private Integer id;
    private  String identification;
    private String name;
    private String address;
    private  String cellPhone;
    private  String email;
    private String password;
    private String zone;
    private String type;

}
