package com.co.gao.tasks.purchase;

import com.co.gao.interactions.Helpers;
import com.co.gao.userinterfaces.ShippingPriceUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ShippingPriceTask implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		Helpers helper = new Helpers();
		actor.attemptsTo(Click.on(ShippingPriceUI.BTN_SELECT_DEPARMENT));
		actor.attemptsTo(Click.on(ShippingPriceUI.BTN_DEPARMENT));
		helper.sleepSeconds(2);
		actor.attemptsTo(Click.on(ShippingPriceUI.BTN_SELECT_CITY));
		actor.attemptsTo(Click.on(ShippingPriceUI.BTN_CITY));
		helper.sleepSeconds(2);
		actor.attemptsTo(Click.on(ShippingPriceUI.BTN_SELECT_NEIGHBORHOOD));
		actor.attemptsTo(Click.on(ShippingPriceUI.BTN_NEIGHBORHOOD));
		helper.sleepSeconds(2);
		actor.attemptsTo(Click.on(ShippingPriceUI.BTN_NEXT));
		
		//Verify
		actor.attemptsTo(Enter.theValue("Calle 26A # 58BB 46").into(ShippingPriceUI.TXT_ADDRESS));
		helper.sleepSeconds(2);
		actor.attemptsTo(Enter.theValue("APTO 201").into(ShippingPriceUI.TXT_ADDRESS_ADDITIONAL));
		helper.sleepSeconds(2);
		actor.attemptsTo(Click.on(ShippingPriceUI.BTN_ADD_ADDRESS));
		helper.sleepSeconds(3);
		actor.attemptsTo(Click.on(ShippingPriceUI.BTN_CONTINUE));
	}
	
	public static ShippingPriceTask gao() {

		return Tasks.instrumented(ShippingPriceTask.class);
	}

}
