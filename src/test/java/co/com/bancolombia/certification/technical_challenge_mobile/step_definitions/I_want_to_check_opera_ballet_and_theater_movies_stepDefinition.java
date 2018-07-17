package co.com.bancolombia.certification.technical_challenge_mobile.step_definitions;

import java.util.List;

import co.com.bancolombia.certification.technical_challenge_mobile.steps.checkMoviesSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class I_want_to_check_opera_ballet_and_theater_movies_stepDefinition {

	@Steps
	checkMoviesSteps CheckMoviesSteps;

	@Given("^I want to check opera, ballet and theater movies$")
	public void I_want_to_check_opera_ballet_and_theater_movies() throws Throwable {
		CheckMoviesSteps.OpenPage();
	}

	@When("^I check opera movies$")
	public void I_check_opera_movies(List<String> movieType) throws Throwable {
		CheckMoviesSteps.BurguerButton();
		CheckMoviesSteps.OperaButton();
		CheckMoviesSteps.OperaMovies(movieType.get(1));
	}

	@And("^I check ballet movies$")
	public void I_check_ballet_movies(List<String> movieType) throws Throwable {
		CheckMoviesSteps.BurguerButtonBallet();
		CheckMoviesSteps.BalletButton();
		CheckMoviesSteps.BalletMovies(movieType.get(1));
	}

	@And("^I check theater movies$")
	public void I_check_theater_movies(List<String> movieType) throws Throwable {
		CheckMoviesSteps.BurguerTheaterButton();
		CheckMoviesSteps.TheaterButton();
		CheckMoviesSteps.TheaterMovies(movieType.get(1));
	}

	@Then("^Successful registration$")
	public void Successful_registration() throws Throwable {
		CheckMoviesSteps.finish();
	}

}
