package com.sgtesting.EXCEL_Assignment01;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ASSIGNMENT03 {

	public static void main(String[] args) {
		READ_WRITE();

	}
	private static void READ_WRITE()
	{
		FileInputStream fin=null;
		FileOutputStream fout =null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row rowsh1=null;
		Row rowsh2=null;
		Cell cellsh1=null;
		Cell cellsh2=null; 



		try
		{
			fin=new FileInputStream("C:\\Excel_new\\RowFirst.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("a");
			sh2=wb.getSheet("Sheet1");
			if(sh2==null)
			{
				wb.createSheet("Sheet1");
			}
			rowsh1=sh1.getRow(0);
			int rc=rowsh1.getPhysicalNumberOfCells();
			for(int i=0;i<rc;i++)
			{
				cellsh1=rowsh1.getCell(i);
				String data=cellsh1.getStringCellValue();
				rowsh2=sh2.getRow(i);
				if(rowsh2==null)
				{
					rowsh2=sh2.createRow(i);
				}
				cellsh2=rowsh2.getCell(0);
				if(cellsh2==null)
				{
					cellsh2=rowsh2.createCell(0);
				}
				cellsh2.setCellValue(data);
				fout=new FileOutputStream("C:\\Excel_new\\RowFirst.xlsx");
				wb.write(fout);

			}



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
