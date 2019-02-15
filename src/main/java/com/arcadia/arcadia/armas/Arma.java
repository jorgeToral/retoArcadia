package com.arcadia.arcadia.armas;

import com.arcadia.arcadia.personajes.Estrategia;
import lombok.Data;

@Data
public abstract class Arma implements Estrategia {

  public double fuerzaAtaque;

}
