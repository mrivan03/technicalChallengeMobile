package co.com.bancolombia.certification.technical_challenge_mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import co.com.bancolombia.certification.technical_challenge_mobile.utilities.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CineColombiaHomePage extends MobilePageObject {

	public CineColombiaHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]")
	private WebElement BurguerButton;

	@AndroidFindBy(id = "com.cinepapaya.cinecolombia:id/tviOpera")
	private WebElement OperaButton;

	public void ClickBurguerButton() {
		BurguerButton.click();
	}

	public void ClickOperaButton() {
		OperaButton.click();
	}

}
