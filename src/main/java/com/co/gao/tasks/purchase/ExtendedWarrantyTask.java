package com.co.gao.tasks.purchase;

import com.co.gao.userinterfaces.ExtendedWarrantyUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

public class ExtendedWarrantyTask implements Task {
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Scroll.to(ExtendedWarrantyUI.BTN_PRODUCT).andAlignToTop());
		actor.attemptsTo(MoveMouse.to(ExtendedWarrantyUI.BTN_PRODUCT));
		actor.attemptsTo(Click.on(ExtendedWarrantyUI.BTN_ADDBAG));
		actor.attemptsTo(Click.on(ExtendedWarrantyUI.BTN_VIEWBAG));
		
	}
	
	public static ExtendedWarrantyTask gao() {

		return Tasks.instrumented(ExtendedWarrantyTask.class);
	}

}
