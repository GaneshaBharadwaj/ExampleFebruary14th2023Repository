package com.sgtesting.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	/**
	 * Verify the existence of Frames in a Web Page
	 */
	public static boolean isFramePresent(WebDriver oBrowser)
	{
		boolean status=false;
		try
		{
			List<WebElement> oFrames=oBrowser.findElements(By.tagName("iframe"));
			status=(oFrames.size() > 0);
		}catch (Exception e) {
			status=false;
		}
		return status;
	}
	
	/**
	 * Find number of Frames in a Web Page
	 */
	public static int getFramesCount(WebDriver oBrowser)
	{
		int count=0;
		try
		{
			List<WebElement> oFrames=oBrowser.findElements(By.tagName("iframe"));
			count=oFrames.size();
		}catch (Exception e) {
			count=-1;
		}
		return count;
	}
	
	/**
	 * Switch To Frame using WebElement
	 */
	public static boolean getFrameControl(WebDriver oBrowser,WebElement oEle)
	{
		boolean status=false;
		try
		{
			oBrowser.switchTo().frame(oEle);
			status=true;
		}catch (Exception e) 
		{
			status=false;
		}
		return status;
	}
	
	/**
	 * Switch To Frame using frame name
	 */
	public static boolean getFrameControl(WebDriver oBrowser,String name)
	{
		boolean status=false;
		try
		{
			oBrowser.switchTo().frame(name);
			status=true;
		}catch (Exception e) 
		{
			status=false;
		}
		return status;
	}
	
	/**
	 * Switch To Frame using index
	 */
	public static boolean getFrameControl(WebDriver oBrowser,int index)
	{
		boolean status=false;
		try
		{
			oBrowser.switchTo().frame(index);
			status=true;
		}catch (Exception e) 
		{
			status=false;
		}
		return status;
	}
	
	/**
	 * Verify the existence of popup / child/ tabbed Browser
	 */
	public static boolean isPopupPresent(WebDriver oBrowser)
	{
		boolean status=false;
		try
		{
			int count=oBrowser.getWindowHandles().size()-1;
			if(count>0)
			{
				status=true;
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
	
	/**
	 * Find number of popup / child/ tabbed Browsers
	 */
	public static int getPopupCount(WebDriver oBrowser)
	{
		int count=0;
		try
		{
			count=oBrowser.getWindowHandles().size()-1;
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return count;
	}
	
	/**
	 * Verify the Alert existence
	 */
	public static boolean isAlertPresent(WebDriver oBrowser)
	{
		boolean status=false;
		try
		{
			oBrowser.switchTo().alert();
			status=true;
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
	
	/**
	 * Verify existance of any GUI Element
	 */
	public static boolean isElementPresent(WebDriver oBrowser, By by)
	{
		boolean status=false;
		try
		{
			status=oBrowser.findElement(by).isDisplayed();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
}
