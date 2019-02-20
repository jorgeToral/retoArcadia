package com.arcadia.arcadia.personajes;

import com.arcadia.arcadia.armas.Arma;
import lombok.Data;

@Data
public abstract class Personaje  {

  private String nombre;

  private double fuerzaBase;

  private double poderAtaque;

  private Arma arma;

  public double getPoderAtaque() {

    System.out.println( "------------------" + this.fuerzaBase );
    return this.fuerzaBase + this.getArma().getFuerzaAtaque();

  }

  public double fuerzaRestante() {

    return this.getArma().ataque( this.getPoderAtaque() );

  }

}
