package co.com.bancolombia.certification.technical_challenge_mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import co.com.bancolombia.certification.technical_challenge_mobile.utilities.MobilePageObject;
import co.com.bancolombia.certification.technical_challenge_mobile.utilities.WriteExcel;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CineColombiatheaterPage extends MobilePageObject {

	public CineColombiatheaterPage(WebDriver driver) {
		super(driver);
	}

	String[][] moviesOperaList = new String[3][2];
	String Elemento;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Cine Colombia S.A.\"]")
	private WebElement BurguerButton1;
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]")
	private WebElement BurguerButton2;
	@AndroidFindBy(id = "com.cinepapaya.cinecolombia:id/tviTeatro")
	private WebElement theaterButton;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	private WebElement FirstMovieTheaterName;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[3]")
	private WebElement FirstMovieTheaterDate;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	private WebElement SecondMovieTheaterName;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[3]")
	private WebElement SecondMovieTheaterDate;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	private WebElement ThirdMovieTheaterName;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[3]")
	private WebElement ThirdMovieTheaterDate;

	public void ClickBurguerButton() {
		try {
			BurguerButton1.click();
		} catch (Exception e) {
			BurguerButton2.click();
		}
	}

	public void ClicktheaterButton() {
		theaterButton.click();
	}

	public void TheaterMovies(String movieType) {
		try {

			Elemento = FirstMovieTheaterName.getText();
			moviesOperaList[0][0] = Elemento;
			Elemento = FirstMovieTheaterDate.getText();
			moviesOperaList[0][1] = Elemento.substring(9, Elemento.length());
			Elemento = SecondMovieTheaterName.getText();
			moviesOperaList[1][0] = Elemento;
			Elemento = SecondMovieTheaterDate.getText();
			moviesOperaList[1][1] = Elemento.substring(9, Elemento.length());
			Elemento = ThirdMovieTheaterName.getText();
			moviesOperaList[2][0] = Elemento;
			Elemento = ThirdMovieTheaterDate.getText();
			moviesOperaList[2][1] = Elemento.substring(9, Elemento.length());

		} catch (Exception e) {
		}

		WriteExcel writeExcel = new WriteExcel(movieType, moviesOperaList);
		writeExcel.start();

	}

}