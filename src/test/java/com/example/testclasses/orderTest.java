package com.example.testclasses;

import com.example.BaseTest;
import com.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class orderTest extends BaseTest {

    private LoginPage loginPage;

    @Test
    @Parameters("url")
    public void orderTestFirst(@Optional String url) {


    WebDriver driver = getWebDriver();

    loginPage = new LoginPage(driver, url);
    loginPage.login(username,password);

    }

}
