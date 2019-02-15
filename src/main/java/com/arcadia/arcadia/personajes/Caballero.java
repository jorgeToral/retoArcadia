package com.arcadia.arcadia.personajes;

import lombok.Data;

@Data
public class Caballero extends Personaje {

  private String nombre = "Caballero" ;

  private double fuerzaBase = 150;

  private double poderAtaque;


}
