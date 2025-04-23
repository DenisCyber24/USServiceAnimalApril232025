package Pages;

import Utilities.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class emotionalAnimalSupportPage extends CommonMethods {

    public emotionalAnimalSupportPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@name='notes.is-this-your-first-time-registering-your-emotional-support-animal' and @id='option0']")
    public WebElement regFirstimeForEmotionalSupportAnimal;

    @FindBy(xpath="//h5[text()='Next']/parent::button")
    public WebElement easNextBtn;

    @FindBy(xpath="//input[@name='notes.has-a-disability-that-qualifies' and @id='option0']")
    public WebElement disabilityThatQualifies;

    public void clickRegFirstimeForEmotionalSupportAnimal(){

        CommonMethods.clickUsingJs(regFirstimeForEmotionalSupportAnimal);
    }

    public void clickEasNextBtn(){
        CommonMethods.clickUsingJs(easNextBtn);
    }


    public void clickDisabilityThatQualifies(){
        CommonMethods.clickUsingJs(disabilityThatQualifies);
    }

}
