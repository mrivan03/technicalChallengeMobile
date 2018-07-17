package co.com.bancolombia.certification.technical_challenge_mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;

import co.com.bancolombia.certification.technical_challenge_mobile.utilities.WriteExcel;
import co.com.bancolombia.certification.technical_challenge_mobile.utilities.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CineColombiaBalletPage extends MobilePageObject {

	public CineColombiaBalletPage(WebDriver driver) {
		super(driver);
	}

	String[][] moviesOperaList = new String[3][2];
	String Elemento;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Cine Colombia S.A.\"]")
	private WebElement BurguerButton;
	@AndroidFindBy(id = "com.cinepapaya.cinecolombia:id/tviBallet")
	private WebElement BalletButton;
	@AndroidFindBy(id = "com.cinepapaya.cinecolombia:id/tviCinecoEmpty")
	private WebElement message;

	public void ClickBurguerButton() {
		BurguerButton.click();
	}

	public void ClickBalletButton() {
		BalletButton.click();
	}

	public void BalletMovies(String movieType) {
		try {

			Elemento = message.getText();
			moviesOperaList[0][0] = Elemento;

		} catch (Exception e) {
		}

		WriteExcel writeExcel = new WriteExcel(movieType, moviesOperaList);
		writeExcel.start();

	}

}