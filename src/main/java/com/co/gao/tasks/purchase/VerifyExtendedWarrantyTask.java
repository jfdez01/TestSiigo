package com.co.gao.tasks.purchase;

import com.co.gao.interactions.Helpers;
import com.co.gao.userinterfaces.ExtendedWarrantyUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class VerifyExtendedWarrantyTask implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		Helpers helper = new Helpers();
		actor.attemptsTo(Scroll.to(ExtendedWarrantyUI.BTN_SCROLL_WARRANT).andAlignToTop());
		helper.sleepSeconds(2);
		actor.attemptsTo(Click.on(ExtendedWarrantyUI.BTN_SELECT_WARRANT));
		helper.sleepSeconds(2);
		actor.attemptsTo(Click.on(ExtendedWarrantyUI.BTN_WARRANT));
		helper.sleepSeconds(2);
		actor.attemptsTo(Click.on(ExtendedWarrantyUI.BTN_SELECT_WARRANT2));
		helper.sleepSeconds(2);
		actor.attemptsTo(Click.on(ExtendedWarrantyUI.BTN_WARRANT2));
		helper.sleepSeconds(2);
		actor.attemptsTo(Click.on(ExtendedWarrantyUI.BTN_BUY));
		
    }
	
	public static VerifyExtendedWarrantyTask gao() {

		return Tasks.instrumented(VerifyExtendedWarrantyTask.class);
	}
}
