package StepDefinitions;

import Utilities.CommonMethods;
import Utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.time.LocalTime;

import static StepDefinitions.PageInitializer.getEsaPage;
import static StepDefinitions.PageInitializer.regPage;
import static Utilities.CommonMethods.driver;

public class getEsaLetterSteps {

    @Given("I navigate to homepage of get ESA Letter page")
    public void i_navigate_to_homepage_of_get_esa_letter_page() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        driver.get(ConfigReader.read("getesaletterurl"));
    }

    @When("I answer all the quesionare for ESA letter")
    public void i_answer_all_the_quesionare_for_esa_letter() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        regPage.clickdoYouHaveaDog();


        Thread.sleep(3000);


        regPage.clickAreYouAtleast18YearsOld();


        CommonMethods.waitForVisibiltyOfElement(getEsaPage.reqForESALetter,3000);

        getEsaPage.clickreqForESALetter();

        getEsaPage.clickEsaSave850perYear();

        CommonMethods.scrollDown(500);
       // Thread.sleep(3000);
      getEsaPage.clickOnNextBtn();

            }

    @When("I enter the details required for ESA letter")
    public void i_enter_the_details_required_for_esa_letter() {
        // Write code here that turns the phrase above into concrete actions

        regPage.setName(ConfigReader.read("name"));

        regPage.clickNextBtn();

        regPage.setCity(ConfigReader.read("city"));

        regPage.selectState(ConfigReader.read("State"));

        regPage.clickNextBtn();
        regPage.setEmail();

        regPage.clickNextBtn();

        regPage.setPhone(ConfigReader.read("phone"));

        regPage.clickNextBtn();



    }

    @When("I enter all the details related to animals for ESA letter")
    public void i_enter_all_the_details_related_to_animals_for_esa_letter() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        regPage.selectNoOfDogs();

        regPage.setDogNames(ConfigReader.read("dogname1"),ConfigReader.read("dogname2"));

        regPage.clickNextBtn();

        getEsaPage.selectAnimalType(ConfigReader.read("animalType1"),ConfigReader.read("animalType1"));

        regPage.selectDogBreeds(ConfigReader.read("dog1Breed"),ConfigReader.read("dog2Breed"));
        regPage.clickNextBtn();

        regPage.selectDog1Gender();

        regPage.selectDog2Gender();

        getEsaPage.clickOnNextBtn();


        regPage.setDog1DOB(ConfigReader.read("dob1"));

        regPage.setDog2DOB(ConfigReader.read("dob2"));

        regPage.clickNextBtn();

        regPage.setDogWeights(ConfigReader.read("dog1Weight"),ConfigReader.read("dog2Weight"));

        regPage.clickNextBtn();




    }

    @When("I answer all the questions related to ESA letter for housing")
    public void i_answer_all_the_questions_related_to_esa_letter_for_housing() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();

        getEsaPage.clickEsaLetterForHousing();

        getEsaPage.clickTypeOfHousing();

        getEsaPage.clickOnNextBtn();

        getEsaPage.clickTravellingWithPet();

        getEsaPage.clickPresentingEsaLetter();

        getEsaPage.clickOnNextBtn();

        getEsaPage.clickOnNextBtn();




    }

    @When("I answer all quesionare for Emotional Evaluation")
    public void i_answer_all_quesionare_for_emotional_evaluation() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        getEsaPage.clickMinimalPleasure();

        getEsaPage.clickMinimalSadness();

        getEsaPage.clickMoreAngryOrIrritatedThanUsual();

        getEsaPage.clickAnxiousOrWorried();

        getEsaPage.clickScaredOrPanicked();

        getEsaPage.clickActedImpulsively();

        getEsaPage.clickAvoidedSituationsThatMakeYouNervousOrPanicked();

        getEsaPage.clickseenOrHeardThingsOtherPeopleCouldnt();

        getEsaPage.clickParanoidOrAfraidYouAreInDanger();

        getEsaPage.clickThoughtsOfSuicide();

        getEsaPage.clickOnNextBtn();

        getEsaPage.selectselectESALetter();
    }

    @When("I select the products ESA for the dogs")
    public void i_select_the_products_esa_for_the_dogs() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        getEsaPage.selectESProductForDogs(ConfigReader.read("esacolorAnsSize1"),ConfigReader.read("esacolorAndSize2"));

        getEsaPage.clickESAAddToCartBtn();

        Thread.sleep(3000);

        CommonMethods.scrollDown(1000);

        getEsaPage.clickesaAddToCartNextBtn();
    }






}
