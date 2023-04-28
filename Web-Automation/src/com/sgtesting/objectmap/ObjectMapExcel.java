
package com.sgtesting.objectmap;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class ObjectMapExcel {
	public static Workbook wb=null;
	/**
	 * getLocator
	 * return value : By
	 */
	public ObjectMapExcel(String fileName)
	{
		FileInputStream fin=null;
		try
		{
			fin=new FileInputStream(fileName);
			wb=new XSSFWorkbook(fin);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public By getLocator(String logicalName)
	{
		By by=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				if(cell.getStringCellValue().toLowerCase().trim().equals(logicalName.toLowerCase().trim()))
				{
					cell=row.getCell(1);
					String locatorname=cell.getStringCellValue();
					cell=row.getCell(2);
					String locatorvalue=cell.getStringCellValue();
					System.out.println(locatorname+"   "+locatorvalue);
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
				}
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return by;
	}

}
