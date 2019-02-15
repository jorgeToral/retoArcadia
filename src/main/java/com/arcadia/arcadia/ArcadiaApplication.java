package com.arcadia.arcadia;

import com.arcadia.arcadia.armas.LargoAlcance;
import com.arcadia.arcadia.armas.Arma;
import com.arcadia.arcadia.armas.CuerpoACuerpo;
import com.arcadia.arcadia.personajes.Personaje;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class ArcadiaApplication {

	public static void main(String[] args) {

		PersonajeFactory personajeFactory = new PersonajeFactory();

		Personaje jugadorUno = personajeFactory.getPersonaje("comandante");
		jugadorUno.setArma(new CuerpoACuerpo());
		jugadorUno.setPoderAtaque( jugadorUno.getFuerzaBase() + jugadorUno.getArma().getFuerzaAtaque() );

		System.out.print( " ---> " + jugadorUno.toString());
		System.out.print("\n");

		jugadorUno.setPoderAtaque( jugadorUno.fuerzaRestante() );

		System.out.print( jugadorUno.toString());
		System.out.print("\n");
		System.out.print("\n");

		jugadorUno.setArma( new LargoAlcance() );
		jugadorUno.setPoderAtaque( jugadorUno.getPoderAtaque() + jugadorUno.getArma().getFuerzaAtaque() );

		System.out.print( jugadorUno.toString());
		System.out.print("\n");
		System.out.print("\n");

		jugadorUno.setPoderAtaque( jugadorUno.fuerzaRestante() );

		System.out.print( jugadorUno.toString());
		System.out.print("\n");
		System.out.print("\n");





		//SpringApplication.run(ArcadiaApplication.class, args);

	}

}

