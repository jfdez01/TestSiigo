package com.co.gao.tasks.purchase;

import com.co.gao.interactions.Helpers;
import com.co.gao.userinterfaces.SearchFalabellaUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class SearchFirtsRegstreTask implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		Helpers helper = new Helpers();
	    helper.sleepSeconds(3);
	    actor.attemptsTo(Click.on(SearchFalabellaUI.FIRTS_RESULT));

	}

	public static SearchFirtsRegstreTask gao() {

		return Tasks.instrumented(SearchFirtsRegstreTask.class);
	}
}
