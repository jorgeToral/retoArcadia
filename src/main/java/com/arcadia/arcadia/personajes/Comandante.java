package com.arcadia.arcadia.personajes;

import com.arcadia.arcadia.armas.Arma;
import lombok.Data;

@Data
public class Comandante extends Personaje {

  private String nombre = "Comandante" ;

  private double fuerzaBase = 150;

  private double poderAtaque;

  private Arma arma;


}
