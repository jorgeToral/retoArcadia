package com.arcadia.arcadia.personajes;

import lombok.Data;

@Data
public class Troll extends Personaje {

  private String nombre = "Troll" ;

  private double fuerzaBase = 200;

  private double poderAtaque;


}
