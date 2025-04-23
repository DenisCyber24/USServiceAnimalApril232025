package StepDefinitions;

import Utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static StepDefinitions.PageInitializer.*;
import static StepDefinitions.PageInitializer.getEsaPage;
import static Utilities.CommonMethods.driver;

public class emotionalAnimalSupportSteps {


    @Given("I navigate to homepage of emotional animal support")
    public void i_navigate_to_homepage_of_emotional_animal_support() {
        // Write code here that turns the phrase above into concrete actions
        driver.get(ConfigReader.read("emotionAndSupportAnimalUrl"));
    }
    @When("I answer all the quesionare for Emotional Animal support")
    public void i_answer_all_the_quesionare_for_emotional_animal_support() throws InterruptedException {
        // Write code here that turns the phrase above into concr
        // ete actions
        //sthrow new io.cucumber.java.PendingException();

        regPage.clickdoYouHaveaDog();


        Thread.sleep(3000);


        regPage.clickAreYouAtleast18YearsOld();

        easPage.clickRegFirstimeForEmotionalSupportAnimal();

        Thread.sleep(3000);

        easPage.clickEasNextBtn();

        easPage.clickDisabilityThatQualifies();



    }

    @When("I enter the details required for emotional animal support")
    public void i_enter_the_details_required_for_emotional_animal_support() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        regPage.setName(ConfigReader.read("name"));

        regPage.clickNextBtn();

        regPage.setCity(ConfigReader.read("city"));

        regPage.selectState(ConfigReader.read("State"));

        regPage.clickNextBtn();
        regPage.setEmail();

        regPage.clickNextBtn();

        regPage.setPhone(ConfigReader.read("phone"));

      // Thread.sleep(5000);

        regPage.clickNextBtn();

        regPage.clickNextBtn();
    }

    @When("I enter all the details related to animals for emotional animal support")
    public void i_enter_all_the_details_related_to_animals_for_emotional_animal_support() {
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



}
