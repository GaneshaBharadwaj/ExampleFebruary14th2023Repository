package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absoluteXPath();
	//	relativeXPathUsingTagName();
	//	relativeXPathUsingTagNameWithIndex();
	//	relativeXPathUsingTagNameWithAttributeNameAndValue();
	//	relativeXPathUsingAttributeNameAndValue();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameAndValue();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameAndValueUsingOROperator();
	//	relativeXPathUsingTagNameWithMultipleAttributeNameAndValueUsingAndOperator();
	//	relativeXPathUsingPartialMatchingOfAttributeValue();
	//	relativeXPathUsingTagNameWithAttributeName();
	//	relativeXPathUsingTagNameWithAttributeName_01();
	//	relativeXPathUsingTagNameWithAttributeName_02();
	//	relativeXPathUsingTagNameWithAttributeName_03();
	//	relativeXPathUsingAttributeValue();
	//	relativeXPathUsingTextContent();
		relativeXPathUsingPartialTextContent();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("file:///D:/HTML/Sample.html");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void absoluteXPath()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
	}

	/**
	 *  Case 1: Identify the Element based on tagName
	 *  Syntax: //<tagName>
	 */
	private static void relativeXPathUsingTagName()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
	}
	
	/**
	 *  Case 2: Identify the Element based on tagName with Index
	 *  Syntax: //<tagName>[index]
	 */
	private static void relativeXPathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser2");
	}
	
	/**
	 *  Case 3: Identify the Element based on tagName with attribute name and value
	 *  Syntax: //<tagName>[@attribute='attributevalue']
	 */
	private static void relativeXPathUsingTagNameWithAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	
	/**
	 * case 4: Identify the Element based on attribute name and value
	 *         and irrespective of tagName
	 *  syntax: //*[@attribute='attributevalue']
	 */
	private static void relativeXPathUsingAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//*[@name='submit1btn1']")).click();
	}
	
	/**
	 *  Case 5: Identify the Element based on tagName with Multiple attribute name and value
	 *  Syntax: //<tagName>[@attribute='attributevalue'][@attribute='attributevalue']
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit'][@name='submit1btn1']")).click();
	}
	
	/**
	 *  Case 6: Identify the Element based on tagName with Multiple attribute name and value using OR operator
	 *  Syntax: //<tagName>[@attribute='attributevalue' or @attribute='attributevalue']
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameAndValueUsingOROperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' or @name='submit1btn1']")).click();
	}
	
	/**
	 *  Case 7: Identify the Element based on tagName with Multiple attribute name and value using And operator
	 *  Syntax: //<tagName>[@attribute='attributevalue' and @attribute='attributevalue']
	 */
	private static void relativeXPathUsingTagNameWithMultipleAttributeNameAndValueUsingAndOperator()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' and @name='submit1btn1']")).click();
	}
	
	/**
	 * Case 8: Identify the Element based on partial Matching of Attribute Value
	 * 
	 * starts-with(@attribute,'attribute value');
	 * ends-with(@attribute,'attribute value');
	 * contains(@attribute,'attribute value');
	 * 
	 * Syntax:
	 *  //<tagName>[starts-with(@attribute,'attribute value')]
	 *  //<tagName>[ends-with(@attribute,'attribute value')]
	 *  //<tagName>[contains(@attribute,'attribute value')]
	 */
	private static void relativeXPathUsingPartialMatchingOfAttributeValue()
	{
	//	oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
	
		oBrowser.findElement(By.xpath("//input[contains(@id,'mit1')]")).click();
	}
	
	/**
	 * case 9: Identify the Elements based on tagName with attributeName
	 * Sybtax: 
	 *     //<tagName>[@attributeName]
	 */
	private static void relativeXPathUsingTagNameWithAttributeName()
	{
		//Find the number of link in the application
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of Links in the Application :"+oLinks.size());
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_01()
	{
		//Display All Link Names in the application
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<oLinks.size();i++)
		{
			WebElement link=oLinks.get(i);
			String linkname=link.getText();
			System.out.println("Link Name :"+linkname);
		}
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_02()
	{
		//Based on Ends With Approach click on particular Link
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<oLinks.size();i++)
		{
			WebElement link=oLinks.get(i);
			String linkname=link.getText();
			if(linkname.endsWith("HQ"))
			{
				link.click();
				break;
			}
		}
	}
	
	private static void relativeXPathUsingTagNameWithAttributeName_03()
	{
		//org.openqa.selenium.StaleElementReferenceException: stale element reference: 
		//element is not attached to the page document
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<oLinks.size();i++)
		{
			WebElement link=oLinks.get(i);
			String linkname=link.getText();
			if(linkname.endsWith("HQ"))
			{
				link.click();
			}
		}
	}
	
	/**
	 *  Case 10: Identify the Element based attribute value with
	 *  Irrespective of tagName and AttributeName
	 *  Syntax: //*[@*='attributevalue']
	 */
	private static void relativeXPathUsingAttributeValue()
	{
		oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
	}
	
	/**
	 *  Case 11: Identify the Element based text content
	 *  
	 *  Syntax: //<tagName>[text()='text content']
	 */
	private static void relativeXPathUsingTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='Eclipse Tool']")).click();
	}
	
	/**
	 *  Case 12: Identify the Element based partial text content
	 *  
	 *  starts-with(text(),'text content')
	 *  ends-with(text(),'text content')
	 *  contains(text(),'text content')
	 *  
	 *  Syntax: 
	 *  //<tagName>[starts-with(text(),'text content')]
	 *  //<tagName>[ends-with(text(),'text content')]
	 *  //<tagName>[contains(text(),'text content')]
	 */
	private static void relativeXPathUsingPartialTextContent()
	{
	//	oBrowser.findElement(By.xpath("//a[starts-with(text(),'POI')]")).click();
		oBrowser.findElement(By.xpath("//a[contains(text(),'Software')]")).click();
	}
}
