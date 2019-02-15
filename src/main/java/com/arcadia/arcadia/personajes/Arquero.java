package com.arcadia.arcadia.personajes;

import lombok.Data;

@Data
public class Arquero extends Personaje {

  private String nombre = "Arquero" ;

  private double fuerzaBase = 200;

  private double poderAtaque;


}
