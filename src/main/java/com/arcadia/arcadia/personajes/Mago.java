package com.arcadia.arcadia.personajes;

import lombok.Data;

@Data
public class Mago extends Personaje {

  private String nombre = "Mago" ;

  private double fuerzaBase = 200;

  private double poderAtaque;


}
