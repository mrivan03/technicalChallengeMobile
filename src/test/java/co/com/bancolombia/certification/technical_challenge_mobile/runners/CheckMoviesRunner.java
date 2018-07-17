package co.com.bancolombia.certification.technical_challenge_mobile.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/sources/features/check_movies.feature", glue = {
		"co.com.bancolombia.certification.technical_challenge_mobile.step_definitions" }, snippets = SnippetType.CAMELCASE)
public class CheckMoviesRunner {

}
