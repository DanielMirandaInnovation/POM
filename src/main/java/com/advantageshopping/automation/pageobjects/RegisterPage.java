package com.advantageshopping.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoqa.com/automation-practice-form")
public class RegisterPage extends PageObject {

    public By nameInput = By.id("firstName");
    public By emailInput = By.id("userEmail");
    public By lastNameInput = By.id("lastName");
    public By mobileNumberInput = By.id("userNumber");
    public By hobbiesCheckbox = By.xpath("//label[@for='hobbies-checkbox-1']");
    public By birthdayInput = By.id("dateOfBirthInput");

    public void sendName(String string){
        getDriver().findElement(nameInput).sendKeys(string);
    }

    public void sendEmail(String string){
        getDriver().findElement(emailInput).sendKeys(string);
    }

    public void sendLastName(String string){
        getDriver().findElement(lastNameInput).sendKeys(string);
    }

    public void sendMobileNumber(String string){
        getDriver().findElement(mobileNumberInput).sendKeys(string);
    }

    public void clickHobbiesCheckbox(){
        getDriver().findElement(hobbiesCheckbox).click();
    }

    public void sendBirthday(String string){
        getDriver().findElement(birthdayInput).sendKeys(string);
    }


}
