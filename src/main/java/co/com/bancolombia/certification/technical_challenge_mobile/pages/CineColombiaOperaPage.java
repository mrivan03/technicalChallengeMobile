package co.com.bancolombia.certification.technical_challenge_mobile.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import co.com.bancolombia.certification.technical_challenge_mobile.utilities.WriteExcel;
import co.com.bancolombia.certification.technical_challenge_mobile.utilities.MobilePageObject;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CineColombiaOperaPage extends MobilePageObject {

	public CineColombiaOperaPage(WebDriver driver) {
		super(driver);
	}

	String[][] moviesOperaList = new String[3][2];
	String Elemento;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	private WebElement FirstMovieOperaName;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
	private WebElement FirstMovieOperaDate;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	private WebElement SecondMovieOperaName;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
	private WebElement SecondMovieOperaDate;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	private WebElement thirdMovieOperaName;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
	private WebElement thirdMovieOperaDate;

	public void OperaMovies(String movieType) {
		try {

			Elemento = FirstMovieOperaName.getText();
			moviesOperaList[0][0] = Elemento.substring(11, Elemento.length());
			Elemento = FirstMovieOperaDate.getText();
			moviesOperaList[0][1] = Elemento.substring(9, Elemento.length());
			Elemento = SecondMovieOperaName.getText();
			moviesOperaList[1][0] = Elemento.substring(11, Elemento.length());
			Elemento = SecondMovieOperaDate.getText();
			moviesOperaList[1][1] = Elemento.substring(9, Elemento.length());
			Elemento = thirdMovieOperaName.getText();
			moviesOperaList[2][0] = Elemento.substring(11, Elemento.length());
			Elemento = thirdMovieOperaDate.getText();
			moviesOperaList[2][1] = Elemento.substring(9, Elemento.length());

		} catch (Exception e) {
		}

		WriteExcel writeExcel = new WriteExcel(movieType, moviesOperaList);
		writeExcel.start();

	}

}
