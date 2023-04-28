package com.sgtesting.EXCEL_Assignment01;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ASSIGNMET01 {

	public static void main(String[] args) {
		READ_ERITE();
	}
	private static void READ_ERITE()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row rowsh1=null;
		Row rowsh2=null;
		Cell cellsh1=null;
		Cell cellsh2=null;
		try
		{
			fin=new FileInputStream("C:\\Excel_new\\Book2.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			sh2=wb.getSheet("Sheet2");
			if(sh2==null)
			{
				sh2=wb.createSheet("Sheet2");
			}
			int k=0;
			int rc=sh1.getPhysicalNumberOfRows();
			for(int i=rc-1;i>=0;i--)
			{
				rowsh1= sh1.getRow(i);
				cellsh1=rowsh1.getCell(0);
				String data=cellsh1.getStringCellValue();
				rowsh2=sh2.getRow(k);
				if(rowsh2==null)
				{
					rowsh2=sh2.createRow(k);
				}
				k++;
				cellsh2=rowsh2.getCell(0);
				if(cellsh2==null)
				{
					cellsh2=rowsh2.createCell(0);
				}
				cellsh2.setCellValue(data);
			}
			fout=new FileOutputStream("C:\\Excel_new\\Book2.xlsx");
			wb.write(fout);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
