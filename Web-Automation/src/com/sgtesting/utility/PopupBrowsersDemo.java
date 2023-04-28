package com.sgtesting.utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupBrowsersDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handlePopups();
	}
	
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void handlePopups()
	{
		try
		{
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			Thread.sleep(2000);
			boolean v1=Utility.isPopupPresent(oBrowser);
			int count=Utility.getPopupCount(oBrowser);
			System.out.println("# of Popups are :"+count);
			if(v1)
			{
				System.out.println("Popup window is Present");
			}
			else
			{
				System.out.println("Popup window is not Present");
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
