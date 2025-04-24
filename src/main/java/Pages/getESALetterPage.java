package Pages;

import Utilities.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static StepDefinitions.PageInitializer.regPage;

public class getESALetterPage extends CommonMethods {

    public getESALetterPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@name='notes.is-this-your-first-time-receiving-an-esa-letter' and @id='option0']")
    public WebElement reqForESALetter;

    @FindBy(xpath="//input[@name='notes.did-you-know-that-an-esa-could-save-you-up-to-850-per-year-by-being-exempt-from-pet-rent-and-pet-deposits' and @id='option0']")
    WebElement esaSave850perYear;

    @FindBy(xpath="//h5[text()='Next']/parent::button")
    WebElement esanextBtn;

    @FindBy(xpath="//select[@id='0.species_id']")
    WebElement animalType1;

    @FindBy(xpath="//select[@id='1.species_id']")
    WebElement animalType2;

    @FindBy(xpath="//input[@name='notes.do-you-need-an-esa-letter-for-housing' and @id='option0']")
    WebElement esaLetterForHousing;

    @FindBy(xpath="//input[@name='notes.what-kind-of-housing-do-you-live-in-or-will-you-need-covered' and @id='option1']")
    WebElement typeOfHousing;

    @FindBy(xpath="//input[@name='notes.do-you-need-your-esa-letter-to-cover-travel' and @id='option0']")
    WebElement travellingWithPet;

    @FindBy(xpath="//input[@name='notes.does-the-idea-of-presenting-your-esa-letter-make-you-nervous' and @id='option0']")
    WebElement presentingEsaLetter;

    @FindBy(xpath="//input[@name='notes.how-often-have-you-had-minimal-pleasure-doing-things-you-normally-like-to-do-during-the-past-two-2-weeks' and @id='option1']")
    WebElement minimalPleasure;

    @FindBy(xpath="//input[@name='notes.how-often-have-you-felt-sad-or-depressed-during-the-past-two-2-weeks' and @id='option2']")
    WebElement minimalSadness;

    @FindBy(xpath="//input[@name='notes.how-often-have-you-felt-more-angry-or-irritated-than-usual-during-the-past-two-2-weeks' and @id='option1']")
    WebElement moreAngryOrIrritatedThanUsual;

    @FindBy(xpath="//input[@name='notes.how-often-have-you-felt-anxious-or-worried-during-the-past-two-2-weeks' and @id='option2']")
    WebElement anxiousOrWorried;

    @FindBy(xpath="//input[@name='notes.how-often-have-you-felt-scared-or-panicked-during-the-past-two-2-weeks' and @id='option1']")
    WebElement scaredOrPanicked;

    @FindBy(xpath="//input[@name='notes.how-often-have-you-acted-impulsively-during-the-past-two-2-weeks' and @id='option2']")
    WebElement actedImpulsively;

    @FindBy(xpath="//input[@name='notes.how-often-have-you-avoided-situations-that-make-you-nervous-or-panicked-during-the-past-two-2-weeks' and @id='option1']")
    WebElement avoidedSituationsThatMakeYouNervousOrPanicked;

    @FindBy(xpath="//input[@name='notes.how-often-have-you-seen-or-heard-things-other-people-couldnt-during-the-past-two-2-weeks' and @id='option2']")
    WebElement seenOrHeardThingsOtherPeopleCouldnt;

    @FindBy(xpath="//input[@name='notes.how-often-have-you-felt-paranoid-or-afraid-you-are-in-danger-during-the-past-two-2-weeks' and @id='option1']")
    WebElement paranoidOrAfraidYouAreInDanger;

    @FindBy(xpath="//input[@name='notes.over-the-past-two-weeks-have-you-had-thoughts-of-suicide' and @id='option1']")
    WebElement thoughtsOfSuicide;

    @FindBy(xpath="//input[@id='optionESA Consult']")
    WebElement ESALetter;

    @FindBy(xpath="//span[text()='ESA Vest']/parent::h1//following::input[2]")
    WebElement selectESAProductForDog1;

    @FindBy(xpath="//span[text()='ESA Vest']/parent::h1//following::input[3]")
    WebElement selectESAProductForDog2;

    @FindBy(xpath="//span[text()='ESA Vest']/parent::h1/following::p[1]/parent::button")
    WebElement esaaddToCartBtn;

    @FindBy(xpath="//p[text()='Go Back']/parent::button/following::button[1]")
    WebElement addCartNextButton;



    public void clickreqForESALetter(){

        CommonMethods.clickUsingJs(reqForESALetter);
    }

    public void clickEsaSave850perYear(){

        CommonMethods.clickUsingJs(esaSave850perYear);
    }

    public void clickOnNextBtn(){

//        CommonMethods.waitForVisibiltyOfElement(esanextBtn,5000);

        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(1000));

        wt.until(ExpectedConditions.elementToBeClickable(esanextBtn));

         CommonMethods.clickUsingJs(esanextBtn);

    }

    public void selectAnimalType(String animal1,String animal2){

        Select s1=new Select(animalType1);

        s1.selectByVisibleText(animal1);

        Select s2=new Select(animalType2);

        s2.selectByVisibleText(animal2);
    }

    public void clickEsaLetterForHousing(){

        CommonMethods.clickUsingJs(esaLetterForHousing);
    }

    public void clickTypeOfHousing(){

        CommonMethods.clickUsingJs(typeOfHousing);
    }

    public void clickTravellingWithPet(){

        CommonMethods.clickUsingJs(travellingWithPet);
    }


    public void clickPresentingEsaLetter(){

        CommonMethods.clickUsingJs(presentingEsaLetter);
    }

    public void clickMinimalPleasure(){

        CommonMethods.clickUsingJs(minimalPleasure);
    }

    public void clickMinimalSadness(){

        CommonMethods.clickUsingJs(minimalSadness);
    }

    public void clickMoreAngryOrIrritatedThanUsual(){

        CommonMethods.clickUsingJs(moreAngryOrIrritatedThanUsual);
    }

    public void clickAnxiousOrWorried(){

        CommonMethods.clickUsingJs(anxiousOrWorried);
    }

    public void clickScaredOrPanicked(){

        CommonMethods.clickUsingJs(scaredOrPanicked);
    }

    public void clickActedImpulsively(){

        CommonMethods.clickUsingJs(actedImpulsively);
    }

    public void clickAvoidedSituationsThatMakeYouNervousOrPanicked(){

        CommonMethods.clickUsingJs(avoidedSituationsThatMakeYouNervousOrPanicked);
    }

    public void clickseenOrHeardThingsOtherPeopleCouldnt(){

        CommonMethods.clickUsingJs(seenOrHeardThingsOtherPeopleCouldnt);
    }

    public void clickParanoidOrAfraidYouAreInDanger(){
        CommonMethods.clickUsingJs(paranoidOrAfraidYouAreInDanger);
    }

    public void clickThoughtsOfSuicide(){

        CommonMethods.clickUsingJs(thoughtsOfSuicide);
    }

    public void selectselectESALetter(){

        CommonMethods.clickUsingJs(ESALetter);
    }

    public void selectESProductForDogs(String v1,String v2) throws InterruptedException {

        //selectESAProductForDog1.click();
        CommonMethods.clickUsingJs(selectESAProductForDog1);

        Select s1=new Select(regPage.selectColorOrSize1);
        s1.selectByValue(v1);

       // selectESAProductForDog2.click();
        CommonMethods.clickUsingJs(selectESAProductForDog2);

//CommonMethods.waitForVisibiltyOfElement(selectColorOrSize2,1000);

        Select s2=new Select(regPage.selectColorOrSize2);
        s2.selectByValue(v2);


    }

    public void clickESAAddToCartBtn() throws InterruptedException {

        Thread.sleep(3000);
      //  CommonMethods.scrollDown(500);
        esaaddToCartBtn.click();
    }

    public void clickesaAddToCartNextBtn() throws InterruptedException {

        Thread.sleep(3000);
        CommonMethods.scrollDown(500);
        addCartNextButton.click();
    }

}
