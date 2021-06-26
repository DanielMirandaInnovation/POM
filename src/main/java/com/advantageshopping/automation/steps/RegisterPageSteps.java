package com.advantageshopping.automation.steps;

import com.advantageshopping.automation.models.DataInjection;
import com.advantageshopping.automation.pageobjects.RegisterPage;
import com.advantageshopping.automation.utils.Times;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class RegisterPageSteps {

    RegisterPage registerPage = new RegisterPage();
    DataInjection dataInjection = new DataInjection();
    Robot robot = new Robot();

    public RegisterPageSteps() throws AWTException {
    }

    @Step
    public void openBrowser(){
        registerPage.open();
    }

    @Step
    public void registerNewUser() throws InterruptedException {
        registerPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        registerPage.sendName(dataInjection.getName());
        registerPage.sendEmail(dataInjection.getEmail());
        registerPage.sendLastName(dataInjection.getLastName());
        registerPage.sendMobileNumber(dataInjection.getMobileNumber());
        Times.waitFor(2000);
        registerPage.clickHobbiesCheckbox();
        registerPage.sendBirthday(dataInjection.getBirthday());

    }

}
