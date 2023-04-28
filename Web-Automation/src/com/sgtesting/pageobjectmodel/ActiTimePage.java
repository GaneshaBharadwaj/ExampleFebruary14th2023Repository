package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//WebElement for UserName text field
	private WebElement username;
	
	public WebElement getUserName()
	{
		return username;
	}

	//WebElement for Password text Field
	private WebElement pwd;
	
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//WebElement for Login button
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement oLogin;
	
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//WebElement for Logout link
	@FindBy(linkText = "Logout")
	private WebElement oLogout;
	
	public WebElement getLogout()
	{
		return oLogout;
	}
}
