package com.co.gao.tasks.purchase;


import com.co.gao.userinterfaces.AddBagProductUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;


public class AddBagProductTask implements Task {
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue("PS4").into(AddBagProductUI.TXT_SEARCH));
		actor.attemptsTo(Click.on(AddBagProductUI.BTN_SEARCH));
		actor.attemptsTo(Scroll.to(AddBagProductUI.BTN_PRODUCT).andAlignToTop());
		actor.attemptsTo(MoveMouse.to(AddBagProductUI.BTN_PRODUCT));
		actor.attemptsTo(Click.on(AddBagProductUI.BTN_ADDBAG));
		actor.attemptsTo(Click.on(AddBagProductUI.BTN_NEXTBUY));
		
		
	}
	
	public static AddBagProductTask gao() {

		return Tasks.instrumented(AddBagProductTask.class);
	}
}
