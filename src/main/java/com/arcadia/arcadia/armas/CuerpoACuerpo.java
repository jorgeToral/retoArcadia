package com.arcadia.arcadia.armas;

import com.arcadia.arcadia.personajes.Estrategia;
import lombok.Data;

@Data
public class CuerpoACuerpo extends Arma implements Estrategia {

  private double fuerzaAtaque = 100;

  @Override
  public double ataque(double fuerzaBase) {

    fuerzaBase += fuerzaBase * 0.15;

    return fuerzaBase;

  }

}
