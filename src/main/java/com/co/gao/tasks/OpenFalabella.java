package com.co.gao.tasks;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.Map;

import com.co.gao.utils.maps.UrlMaps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenFalabella implements Task {

private static final String URLFALABELLA="URLFALABELLA";

	
	@Override
	public <T extends Actor> void performAs(T actor) {

	    Map<String, String> urlsEnviroment = UrlMaps.urlInit();
	    theActorInTheSpotlight().attemptsTo(Open.url(urlsEnviroment.get(URLFALABELLA)));
      
	}

	public static OpenFalabella gao() {
		
		 return Tasks.instrumented(OpenFalabella.class);
	}

	

}

