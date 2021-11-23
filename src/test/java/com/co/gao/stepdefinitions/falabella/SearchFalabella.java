package com.co.gao.stepdefinitions.falabella;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.co.gao.tasks.OpenBrowser;
import com.co.gao.tasks.purchase.SearchFalabellaTask;
import com.co.gao.tasks.purchase.SearchFirtsRegstreTask;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchFalabella {
	
	@Given("I want to enter the Google website")
	public void iWantToEnterTheGoogleWebsite() {
		theActorInTheSpotlight().attemptsTo(OpenBrowser.gao());
	}

	@When("I search for the word Falabella")
	public void iSearchForTheWordFalabella() {
		theActorInTheSpotlight().attemptsTo(SearchFalabellaTask.gao());
	}

	@Then("I select the first item the search")
	public void iSelectTheFirstItemTheSearch() {
		theActorInTheSpotlight().attemptsTo(SearchFirtsRegstreTask.gao());
	}


}
