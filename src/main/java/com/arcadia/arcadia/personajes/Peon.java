package com.arcadia.arcadia.personajes;

import lombok.Data;

@Data
public class Peon extends Personaje {

  private String nombre = "Caballero" ;

  private double fuerzaBase = 200;

  private double poderAtaque;


}
