package com.co.reto.utest.stepdefinitions;

import static com.co.reto.utest.utils.Constants.CREATE_ACCOUNT;
import static com.co.reto.utest.utils.Constants.UTEST_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.co.reto.utest.tasks.SelectMenuOption;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class CreateAccountStepDefinition {

  @Managed(driver = "chrome")
  WebDriver herBrowser;

  @Before
  public void setStage() {
    OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(herBrowser)));
  }

  @Given("that {word} wants create an account at UTest")
  public void selectCreateAccountOption(String actor) {
    theActorCalled(actor).wasAbleTo(Open.url(UTEST_URL), SelectMenuOption.named(CREATE_ACCOUNT));
  }

  @When("she indicates {string} of her personal data and devices")
  public void sheIndicatesCorrectInformationOfHerPersonalDataAndDevices() {}

  @When("she specifies the password associated with the new account")
  public void sheSpecifiesThePasswordAssociatedWithTheNewAccount() {}

  @Then("she should see the following message: {string}")
  public void sheShouldSeeTheFollowingMessage(String string) {}
}
