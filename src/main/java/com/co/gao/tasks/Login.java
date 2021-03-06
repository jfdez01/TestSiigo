package com.co.gao.tasks;

import org.openqa.selenium.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.co.gao.exceptions.ExceptionsGenerals;
import com.co.gao.userinterfaces.LogeoGao;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

	private static final Logger LOGGER = LoggerFactory.getLogger(Login.class);

	private String user;
	private String password;

	public Login(String user, String password) {
		this.user = user;

		this.password = password;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		try {

			actor.attemptsTo(Click.on(LogeoGao.BTN_CLOSE),(Click.on(LogeoGao.BTN_LOGIN)),(Enter.theValue(user).into(LogeoGao.TXT_NAME)),
					Enter.theValue(password).into(LogeoGao.TXT_PASS), Click.on(LogeoGao.BTN_ADMIT), Click.on(LogeoGao.BTN_CLOSE_FORM));

		} catch (NoSuchElementException e) {

			throw new ExceptionsGenerals(ExceptionsGenerals.MESSAGE_ELEMNT_NOT_FOUND, e);
		} catch (Exception e) {

			LOGGER.error("SEE THE JSON");
		}

	}

	public static Login gao(String user, String password) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Login.class, user, password);
	}

}
