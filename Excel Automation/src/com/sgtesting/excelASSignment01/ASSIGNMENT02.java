package com.sgtesting.excelASSignment01;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ASSIGNMENT02 {


	public static void main(String[] args) {
		writecont();

	}
	private static void writecont()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null; 
		
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Project2");
			row=sh.createRow(9);
			cell=row.createCell(0);
			cell.setCellValue("Flowers");
			
			
			cell=row.createCell(1);
			cell.setCellValue("Flowers1");
			
			
			cell=row.createCell(2);
			cell.setCellValue("Flowers2");
			
			
			cell=row.createCell(3);
			cell.setCellValue("Flowers3");
			
			
			cell=row.createCell(4);
			cell.setCellValue("Flowers4");
			
			
			cell=row.createCell(5);
			cell.setCellValue("Flowers5");
			
			;
			cell=row.createCell(6);
			cell.setCellValue("Flowers6");
			
			
			
			cell=row.createCell(7);
			cell.setCellValue("Flowers7");
			
			;
			cell=row.createCell(8);
			cell.setCellValue("Flowers8");
			
			
			cell=row.createCell(9);
			cell.setCellValue("Flowers9");
			
			
			cell=row.createCell(10);
			cell.setCellValue("Flowers10");
			
			
			cell=row.createCell(11);
			cell.setCellValue("Flowers11");
			
		
			cell=row.createCell(12);
			cell.setCellValue("Flowers12");
			
			
			cell=row.createCell(13);
			cell.setCellValue("Flowers13");
			
			
			cell=row.createCell(14);
			cell.setCellValue("Flowers14");
			
			;
			cell=row.createCell(15);
			cell.setCellValue("Flowers15");
			
			
			cell=row.createCell(16);
			cell.setCellValue("Flowers16");
			
			
			cell=row.createCell(17);
			cell.setCellValue("Flowers17");
			
			
			cell=row.createCell(18);
			cell.setCellValue("Flowers18");
			
			
			cell=row.createCell(19);
			cell.setCellValue("Flowers19");
			
			
			cell=row.createCell(20);
			cell.setCellValue("Flowers20");
			
			
			
			
			fout=new FileOutputStream("C:\\Excel\\Example1.xlsx");
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
