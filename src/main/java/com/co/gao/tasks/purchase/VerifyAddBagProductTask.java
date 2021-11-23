package com.co.gao.tasks.purchase;

import com.co.gao.userinterfaces.AddBagProductUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class VerifyAddBagProductTask implements Task {
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Scroll.to(AddBagProductUI.BTN_BAG).andAlignToBottom());
		actor.attemptsTo(Click.on(AddBagProductUI.BTN_BAG));
		
	}
	
	public static VerifyAddBagProductTask gao() {

		return Tasks.instrumented(VerifyAddBagProductTask.class);
	}
}
