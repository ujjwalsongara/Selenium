package com.example.pages;

import com.example.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage{

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "pass")
    private WebElement pass;


    public LoginPage(WebDriver driver, String url) {
        super(driver);
        PageFactory.initElements(getWebDriver(),this);
        getWebDriver().manage().window().maximize();

        if (url ==null){
            getWebDriver().get(ApplicationProperties.INSTANCE.getBaseUrl());
        }else {
            getWebDriver().get(url);
        }
    }

    public void login (String username , String password){
        email.clear();
        email.sendKeys(username);

        pass.clear();
        pass.sendKeys(password);

    }

}
