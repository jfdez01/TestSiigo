package com.co.gao.tasks.purchase;

import com.co.gao.userinterfaces.SearchFalabellaUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class SearchFalabellaTask implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue("Falabella").into(SearchFalabellaUI.TXT_SEARCH));
		actor.attemptsTo(Click.on(SearchFalabellaUI.SELECT_SEARCH));
		

	}

	public static SearchFalabellaTask gao() {

		return Tasks.instrumented(SearchFalabellaTask.class);
	}
}
