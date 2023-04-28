package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpBrowsersDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		popupBrowsers();
	}
	
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
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
	
	private static void popupBrowsers()
	{
		try
		{
			System.out.println("Before click on Link, Number of Popups :"+getPopupsCount());
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			System.out.println("After click on Link, Number of Popups :"+getPopupsCount());
			Thread.sleep(2000);
			if(getPopupsCount()>0)
			{
				handlePopups();
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static int getPopupsCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	

	private static void handlePopups()
	{
		try
		{
			String parentBrowser=oBrowser.getWindowHandle();
			System.out.println("Parent Browser :"+parentBrowser);
			
			Object childPopups[]=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<childPopups.length;i++)
			{
				String childBrowser=childPopups[i].toString();
				System.out.println("Child Browser :"+childPopups[i]);
				oBrowser.switchTo().window(childBrowser);
				String title=oBrowser.getTitle();
				System.out.println("Title of Child Browser :"+title);
				String url=oBrowser.getCurrentUrl();
				System.out.println("URL of Child Browser :"+url);
				Thread.sleep(1000);
				oBrowser.findElement(By.linkText("Try Free")).click();
				Thread.sleep(2000);
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
