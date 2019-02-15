package com.arcadia.arcadia;

import com.arcadia.arcadia.personajes.*;

public class PersonajeFactory {

  public Personaje getPersonaje(String personaje) {

    Personaje personajeSeleccionado ;

    switch (personaje) {

      case "comandante":
        personajeSeleccionado =  new  Comandante();
        break;
      case "arquero":
        personajeSeleccionado = new Arquero();
        break;
      case "caballero":
        personajeSeleccionado = new Caballero();
        break;
      case "peon":
        personajeSeleccionado = new Peon();
        break;
      case "mago":
        personajeSeleccionado = new Mago();
        break;
      case "ogro":
        personajeSeleccionado = new Ogro();
        break;
      case "troll":
        personajeSeleccionado = new Troll();
        break;
      default:
        personajeSeleccionado = new Comandante();

    }

    return personajeSeleccionado;

  }

}
