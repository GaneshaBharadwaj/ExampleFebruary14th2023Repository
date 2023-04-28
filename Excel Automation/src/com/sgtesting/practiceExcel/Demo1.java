package com.sgtesting.practiceExcel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {

	public static void main(String[] args) {
		write_into_excel();

	}
	private static void write_into_excel()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row  row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet();
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("hello");
			cell=row.createCell(1);
			cell.setCellValue("hai");
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("how");
			cell=row.createCell(1);
			cell.setCellValue(" r u ?");
			fout=new FileOutputStream("C:\\Excel_new\\hello.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}
	

}
