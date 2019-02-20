package com.arcadia.arcadia;

import com.arcadia.arcadia.personajes.*;

public class PersonajeFactory {

  public Personaje getPersonaje(TipoPersonaje personaje) throws Exception {

    Personaje personajeSeleccionado;

    switch (personaje) {

      case Comandante:
        personajeSeleccionado =  new  Comandante();
        break;
      case Arquero:
        personajeSeleccionado = new Arquero();
        break;
      case Caballero:
        personajeSeleccionado = new Caballero();
        break;
      case Peon:
        personajeSeleccionado = new Peon();
        break;
      case Mago:
        personajeSeleccionado = new Mago();
        break;
      case Ogro:
        personajeSeleccionado = new Ogro();
        break;
      case Troll:
        personajeSeleccionado = new Troll();
        break;
      default:
        throw new Exception("Personaje no encontrado");
    }

    return personajeSeleccionado;

  }

}
