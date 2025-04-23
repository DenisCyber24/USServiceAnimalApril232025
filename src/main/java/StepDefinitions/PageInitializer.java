package StepDefinitions;

import Pages.getESALetterPage;
import Pages.registerAnimalServicePage;

import Pages.emotionalAnimalSupportPage;
public class PageInitializer {



   public static registerAnimalServicePage regPage;

    public static getESALetterPage getEsaPage;
    //public static ProductsPage productsPage;

    public static emotionalAnimalSupportPage easPage;




    public static void initializePageObjects(){
        regPage = new registerAnimalServicePage();
        getEsaPage=new getESALetterPage();
        easPage=new emotionalAnimalSupportPage();

    }

}
