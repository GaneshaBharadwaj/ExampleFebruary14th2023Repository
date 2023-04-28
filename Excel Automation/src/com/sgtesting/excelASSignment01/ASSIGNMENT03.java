package com.sgtesting.excelASSignment01;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ASSIGNMENT03 {

	public static void main(String[] args) {
		writecontent();

	}
	private static void writecontent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null; 
		
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Project1");
			row=sh.createRow(0);
			cell=row.createCell(4);
			cell.setCellValue("States");
			
			row=sh.createRow(1);
			cell=row.createCell(4);
			cell.setCellValue("State1");
			
			row=sh.createRow(2);
			cell=row.createCell(4);
			cell.setCellValue("State2");
			
			row=sh.createRow(3);
			cell=row.createCell(4);
			cell.setCellValue("Statet3");
			
			row=sh.createRow(4);
			cell=row.createCell(4);
			cell.setCellValue("State4");
			
			row=sh.createRow(5);
			cell=row.createCell(4);
			cell.setCellValue("State5");
			
			row=sh.createRow(6);
			cell=row.createCell(4);
			cell.setCellValue("Fruit6");
			
			
			row=sh.createRow(7);
			cell=row.createCell(4);
			cell.setCellValue("State7");
			
			row=sh.createRow(8);
			cell=row.createCell(4);
			cell.setCellValue("State8");
			
			row=sh.createRow(9);
			cell=row.createCell(4);
			cell.setCellValue("State9");
			
			row=sh.createRow(10);
			cell=row.createCell(4);
			cell.setCellValue("State10");
			
			row=sh.createRow(11);
			cell=row.createCell(4);
			cell.setCellValue("State11");
			
			row=sh.createRow(12);
			cell=row.createCell(4);
			cell.setCellValue("State12");
			
			row=sh.createRow(13);
			cell=row.createCell(4);
			cell.setCellValue("State13");
			
			row=sh.createRow(14);
			cell=row.createCell(4);
			cell.setCellValue("State14");
			
			row=sh.createRow(15);
			cell=row.createCell(4);
			cell.setCellValue("State15");
			
			row=sh.createRow(16);
			cell=row.createCell(4);
			cell.setCellValue("State16");
			
			row=sh.createRow(17);
			cell=row.createCell(4);
			cell.setCellValue("State17");
			
			row=sh.createRow(18);
			cell=row.createCell(4);
			cell.setCellValue("State18");
			
			row=sh.createRow(19);
			cell=row.createCell(4);
			cell.setCellValue("State19");
			
			row=sh.createRow(20);
			cell=row.createCell(4);
			cell.setCellValue("State20");
			
			
			
			
			fout=new FileOutputStream("C:\\Excel\\Example2.xlsx");
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

