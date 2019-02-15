package com.arcadia.arcadia.armas;

import com.arcadia.arcadia.personajes.Estrategia;
import lombok.Data;

@Data
public class LargoAlcance extends Arma implements Estrategia {

  private double fuerzaAtaque = 200;

  @Override
  public double ataque( double fuerzaBase ) {

    fuerzaBase -= (fuerzaBase * 0.15);

    return fuerzaBase;

  }

}
