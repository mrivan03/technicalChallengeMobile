package co.com.bancolombia.certification.technical_challenge_mobile.steps;

import co.com.bancolombia.certification.technical_challenge_mobile.pages.CineColombiaBalletPage;
import co.com.bancolombia.certification.technical_challenge_mobile.pages.CineColombiaHomePage;
import co.com.bancolombia.certification.technical_challenge_mobile.pages.CineColombiaOperaPage;
import co.com.bancolombia.certification.technical_challenge_mobile.pages.CineColombiatheaterPage;
import net.thucydides.core.annotations.Step;

public class checkMoviesSteps {

	CineColombiaHomePage cineColombiaHomePage;
	CineColombiaOperaPage cineColombiaOperaPage;
	CineColombiaBalletPage cineColombiaBalletPage;
	CineColombiatheaterPage cineColombiatheaterPage;

	@Step
	public void finish() {
		System.out.println("Successfully completed the test");
	}

	@Step
	public void OpenPage() {
		System.out.println("I'm inside the CineColombia app");
	}

	@Step
	public void BurguerButton() {
		cineColombiaHomePage.ClickBurguerButton();
	}

	@Step
	public void OperaButton() {
		cineColombiaHomePage.ClickOperaButton();
	}

	@Step
	public void OperaMovies(String movieType) {
		cineColombiaOperaPage.OperaMovies(movieType);
	}

	@Step
	public void BurguerButtonBallet() {
		cineColombiaBalletPage.ClickBurguerButton();
	}

	@Step
	public void BalletButton() {
		cineColombiaBalletPage.ClickBalletButton();
	}

	@Step
	public void BalletMovies(String movieType) {
		cineColombiaBalletPage.BalletMovies(movieType);
	}

	@Step
	public void BurguerTheaterButton() {
		cineColombiatheaterPage.ClickBurguerButton();
	}

	@Step
	public void TheaterButton() {
		cineColombiatheaterPage.ClicktheaterButton();
	}

	@Step
	public void TheaterMovies(String movieType) {
		cineColombiatheaterPage.TheaterMovies(movieType);
	}

}
