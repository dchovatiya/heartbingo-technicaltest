package com.heartbingo.pages;

import com.heartbingo.Utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * By Dimple Patel
 **/
public class HomePage extends Utility
{
        //Locators Log In link
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//div[@class='site-header__user-details']//a")
    List<WebElement> rightMenu;
    public void clickOnTheLink(String login)
    {
        for (WebElement logIn:rightMenu)
        {
            if(logIn.getText().equalsIgnoreCase(login))
            {
                System.out.println(logIn.getText());
                javaExecutorScriptExecuteScriptToClick(logIn);
                break;
            }
        }
        log.info("Click on the login link"+ login.toString());
    }
}
