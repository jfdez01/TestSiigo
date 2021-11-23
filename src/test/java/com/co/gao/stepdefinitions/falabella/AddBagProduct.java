package com.co.gao.stepdefinitions.falabella;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.co.gao.tasks.purchase.AddBagProductTask;
import com.co.gao.tasks.purchase.VerifyAddBagProductTask;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddBagProduct {
	
	@When("I add a product to the bag")
	public void iAddAProductToTheBag() {
		theActorInTheSpotlight().attemptsTo(AddBagProductTask.gao());
	}

	@Then("I validate that the product was added to the bag")
	public void iValidateThatTheProductWasAddedToTheBag() {
		theActorInTheSpotlight().attemptsTo(VerifyAddBagProductTask.gao());
	}


}
