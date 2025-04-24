package Pages;

import Utilities.CommonMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalTime;

public class registerAnimalServicePage extends CommonMethods {

    @FindBy(xpath="//label[@value='yes']")
    public WebElement doYouHaveaDog;

    @FindBy(xpath="//input[@name='notes.are-you-at-least-18-years-old' and @id='option0']")
    public WebElement areYouAtleast18YearsOld;

    @FindBy(xpath="//h5[text()='Next']//parent::button")
    public WebElement nextBtn;

    @FindBy(xpath="//label[@name='notes.is-this-your-first-time-registering-your-service-dog' and @value='yes']")
    public WebElement isThisYourFirstTimeRegisteringYourServiceDog;

    @FindBy(xpath="//label[@name='notes.did-you-know-that-an-esa-could-save-you-up-to-850-per-year-by-being-exempt-from-pet-rent-and-pet-deposits' and @value='yes']")
    public WebElement exemptionFromPetRentAndPetDeposits;

    @FindBy(xpath="//label[@name='notes.has-a-disability-that-qualifies' and @value='yes']")
    public WebElement hasADisabilityThatQualifies;

    @FindBy(xpath="//input[@name='name']")
    public WebElement name;

    @FindBy(xpath="//input[@id='city']")
    WebElement city;

    @FindBy(xpath="//select[@id='state']")
    WebElement state;

    @FindBy(xpath="//input[@id='email']")
    WebElement email;

    @FindBy(xpath="//input[@id='phone']")
    WebElement phone;

    @FindBy(xpath="//input[@id='option1']/following-sibling::label")
    WebElement noofDogs;

    @FindBy(xpath="//input[@id=' animal-0']")
    WebElement dogName1;

    @FindBy(xpath="//input[@id=' animal-1']")
    WebElement dogName2;

    @FindBy(xpath="//select[@id='0.animal_type_id']")
    WebElement dog1Breed;

    @FindBy(xpath="//select[@id='1.animal_type_id']")
    WebElement dog2Breed;

    @FindBy(xpath="//input[@id='option0.0']/following::label[1]")
    WebElement dog1Gender;

    @FindBy(xpath="//input[@id='option0.1']/following::label[1]")
    WebElement dog2Gender;

    @FindBy(xpath="//input[@name='animals.0.dob']")
    WebElement dog1DOB;

    @FindBy(xpath="//input[@name='animals.1.dob']")
    WebElement dog2DOB;

    @FindBy(xpath="//input[@id='weight.0']")
    WebElement dog1Weight;

    @FindBy(xpath="//input[@id='weight.1']")
    WebElement dog2Weight;

    @FindBy(xpath="//h5[text()='Both']/parent::label")

    WebElement serviceDogNeed;

    @FindBy(xpath="//input[@name='notes.select-the-best-esa-option-for-you']/following::label[2]")
    WebElement selectService;

    @FindBy(xpath="//span[text()='The email field must be a valid email address.']")
    public WebElement emailValidationText1;

    @FindBy(xpath="//span[text()='Email address entered cannot be verified.']")
    public WebElement emailValidationText2;

    @FindBy(xpath="//span[text()='validation.phone']")
    public WebElement phoneValidationText;

    @FindBy(xpath="//span[text()='Dog Vest']/parent::h1//following::input[2]")
    WebElement selectProductForDog1;

    @FindBy(xpath="//span[text()='Dog Vest']/parent::h1//following::input[3]")
    WebElement selectProductForDog2;

    @FindBy(xpath="//small[contains(text(),'Make your selection for Tommy')]/following::select")
    WebElement selectColorOrSize1;

    @FindBy(xpath="//small[contains(text(),'Make your selection for Jimmy')]/following::select")
    WebElement selectColorOrSize2;

    @FindBy(xpath="//span[text()='Dog Vest']/parent::h1/following::p[1]/parent::button")
    WebElement addToCartBtn;


    @FindBy(xpath="//input[@id='shipping-address']")
    WebElement addressDetails;

    @FindBy(xpath="//input[@id='shipping-city']")
    WebElement shippingCity;

    @FindBy(xpath="//select[@id='shipping-state']")
    WebElement shippingState;

    @FindBy(xpath="//input[@id='shipping-zip']")
    WebElement shippingZip;

    @FindBy(xpath="//button[@id='continue-btn']")
    WebElement continueBtn;

    @FindBy(xpath="//input[@name='card-number']")
    WebElement creditCard;


    @FindBy(xpath="//input[@name='card-expiry-date']")
    WebElement expiryDate;

    @FindBy(xpath="//input[@name='card-cvv']")
    WebElement securityCode;

    @FindBy(xpath="//iframe[@data-testid='card-number']")
    WebElement creditCardIframe;

    @FindBy(xpath="//iframe[@data-testid='card-expiry-date']")
    WebElement expiryDateIframe;

    @FindBy(xpath="//iframe[@data-testid='card-cvv']")
    WebElement securityCodeIframe;

    @FindBy(xpath="//span[text()='Pay']/parent::button")
    WebElement payBtn;

    @FindBy(xpath="//span[text()=' Thank You for Your Order ']")
    public WebElement thankYouMsg;



    public registerAnimalServicePage(){
        PageFactory.initElements(driver, this);
    }


    public void clickdoYouHaveaDog(){

        //doYouHaveaDog.click();
        CommonMethods.clickUsingJs(doYouHaveaDog);
    }

    public void clickAreYouAtleast18YearsOld(){

        CommonMethods.clickUsingJs(areYouAtleast18YearsOld);

    }

    public void clickNextBtn(){

        CommonMethods.clickUsingJs(nextBtn);


    }

    public void clickisThisYourFirstTimeRegisteringYourServiceDog(){

       // isThisYourFirstTimeRegisteringYourServiceDog.click();
        CommonMethods.clickUsingJs(isThisYourFirstTimeRegisteringYourServiceDog);


    }

    public void clickExemptionFromPetRentAndPetDeposits(){

        //exemptionFromPetRentAndPetDeposits.click();
        CommonMethods.clickUsingJs(exemptionFromPetRentAndPetDeposits);
    }


    public void clickHasADisabilityThatQualifies(){

        //hasADisabilityThatQualifies.click();
        CommonMethods.clickUsingJs(hasADisabilityThatQualifies);

    }

    public void setName(String n){

        name.sendKeys(n);


    }

    public void setCity(String c){

        city.sendKeys(c);

    }

    public void selectState(String st){

        Select s=new Select(state);

        s.selectByVisibleText(st);

    }

    public void setInvalidEmail(String e){

        email.sendKeys(e);
    }

    public void setEmail(){

        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);

        String s=myObj.toString();

        s=s.substring(12);

        System.out.println(s);

        String emailtxt="denis"+s+"@gmail.com";


        email.sendKeys(emailtxt);

    }

    public void setPhone(String p){

        phone.sendKeys(p);

    }

    public void selectNoOfDogs(){

       // noofDogs.click();
        CommonMethods.clickUsingJs(noofDogs);
    }

    public void setDogNames(String name1,String name2){

        dogName1.sendKeys(name1);

        dogName2.sendKeys(name2);
    }

    public void selectDogBreeds(String breed1,String breed2){

        Select s1=new Select(dog1Breed);

        s1.selectByVisibleText(breed1);

        Select s2=new Select(dog2Breed);

        s2.selectByVisibleText(breed2);
    }

    public void selectDog1Gender(){

        dog1Gender.click();


    }

    public void selectDog2Gender(){

      //  dog2Gender.click();
        CommonMethods.clickUsingJs(dog2Gender);


    }
    public void setDog1DOB(String dob1){

        dog1DOB.sendKeys(dob1);
    }

    public void setDog2DOB(String dob2){

        dog2DOB.sendKeys(dob2);
    }

    public void setDogWeights(String w1,String w2){

        dog1Weight.sendKeys(w1);

        dog2Weight.sendKeys(w2);
    }

    public void clickServiceDogNeed(){

        serviceDogNeed.click();


    }

    public void clickSelectService(){

        CommonMethods.clickUsingJs(selectService);
    }


    public void selectProductForDogs(String v1,String v2) throws InterruptedException {

        CommonMethods.waitForVisibiltyOfElement(selectProductForDog1,1000);

        selectProductForDog1.click();

        Select s1=new Select(selectColorOrSize1);
        s1.selectByValue(v1);

        selectProductForDog2.click();

         CommonMethods.waitForVisibiltyOfElement(selectColorOrSize2,1000);

        Select s2=new Select(selectColorOrSize2);
        s2.selectByValue(v2);


    }


    public void clickAddToCart() throws InterruptedException {

        Thread.sleep(3000);

        addToCartBtn.click();
    }

    public void enterAddress(String add){

        addressDetails.sendKeys(add);
      //  addressDetails.click();

    }

    public void enterShippingCity(String scity){

        shippingCity.sendKeys(scity);
        //  addressDetails.click();

    }

    public void enterShippingState(String sstate){

        Select s=new Select(shippingState);
        s.selectByValue(sstate);
        //  addressDetails.click();

    }

    public void enterShippingZip(String zipcode){

        shippingZip.sendKeys(zipcode);
        //  addressDetails.click();

    }

    public void clickContinueButton(){

        continueBtn.click();
    }

    public void enterCreditCardNo(String cardNo){

        switchFrames(creditCardIframe);

        creditCard.sendKeys(cardNo);

        switchToParentFrame();



    }
    public void enterExpiryDate(String eDate){

        switchFrames(expiryDateIframe);

        expiryDate.sendKeys(eDate);

        switchToParentFrame();

    }

    public void enterSecurityCode(String sCode){

        switchFrames(securityCodeIframe);

        securityCode.sendKeys(sCode);

        switchToParentFrame();

    }

    public void clickPayBtn(){

        payBtn.click();
    }



}
