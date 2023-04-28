package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMap {
	Properties prop=null;
	public ObjectMap(String filepath)
	{
		FileInputStream fin=null;
		try
		{
			fin=new FileInputStream(filepath);
			prop=new Properties();
			prop.load(fin);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public By getLocator(String logicalname)
	{
		By by=null;
		try
		{
			String locator=prop.getProperty(logicalname);
			System.out.println(locator);
			String locatordetails[]=locator.split(";");
			String locatorname=locatordetails[0];
			String locatorvalue=locatordetails[1];
			switch(locatorname.toLowerCase())
			{
			case "id":
				by=By.id(locatorvalue);
				break;
			case "name":
				by=By.name(locatorvalue);
				break;
			case "classname":
				by=By.className(locatorvalue);
				break;
			case "xpath":
				by=By.xpath(locatorvalue);
				break;
			case "linktext":
				by=By.linkText(locatorvalue);
				break;
			case "cssselector":
				by=By.cssSelector(locatorvalue);
				break;
			case "tagname":
				by=By.tagName(locatorvalue);
				break;
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return by;
	}

}
