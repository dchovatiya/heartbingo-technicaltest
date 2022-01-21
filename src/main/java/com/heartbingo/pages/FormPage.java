package com.heartbingo.pages;

import com.heartbingo.Utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * By Dimple Patel
 **/
public class FormPage extends Utility
{
    private static final Logger log = LogManager.getLogger(FormPage.class.getName());

    public FormPage()
    {
        PageFactory.initElements(driver,this);
    }
    //@FindBy(xpath ="//iframe[@class='oneauth-iframe']")
    @FindBy(xpath = "//iframe[@class='oneauth-iframe']")
    WebElement iFrame;
    //@FindBy(className = "bvs-button-group cookies-policy__controls")
    //@FindBy(linkText = "Ok, I Agree")
    @FindBy(xpath = "//button[contains(text(),'Ok, I Agree')]")
    WebElement cookies;
    //@FindBy(css="#username")
    @FindBy(id="username")
    WebElement userName;
    //@FindBy(css="#password")
    @FindBy(id="password")
    WebElement password;
   // @FindBy(linkText="Log In>")
    @FindBy(name="login_submit")
    //@FindBy(xpath="//button[@name=login_submit]")
    //@FindBy(xpath="//button[@type=submit]")
    WebElement loginBtn;
    //@FindBy(xpath = "//div[@class=login_errorMessageWrapper__2ZcGx]")
    @FindBy(className="login_errorMessageWrapper__2ZcGx")
    WebElement errorMsg;
    @FindBy(xpath = "//span[contains(@class,'bvs-icon is-big')]")
    WebElement closeWindow;


    public void handleCookies()
    {
        javaExecutorScriptExecuteScriptToClick(cookies);
    }
    public void sendUserNm(String userNm) {

        switchToIframe(iFrame);
        sendTextToElement(userName,userNm);
        log.info("Enter user name"+ userName.toString());

    }
    public void sendPassWord(String passWd)
    {
        sendTextToElement(password,passWd);
        log.info("Enter password"+ password.toString());

    }
    public void clickOnLoginBtn()
    {
        javaExecutorScriptExecuteScriptToClick(loginBtn);
        log.info("Click on login button"+ loginBtn.toString());


    }
    public String verifyTheErrMsg()  {
        return errorMsg.getText();
    }
    public void switchToHomePage()
    {
        driver.switchTo().defaultContent();
        javaExecutorScriptExecuteScriptToClick(closeWindow);

    }
}
