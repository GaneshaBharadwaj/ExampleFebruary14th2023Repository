package com.sgtesting.excelASSignment01;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ASSIGNMENT04 {
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
			cell=row.createCell(0);
			cell.setCellValue("City");
			
			row=sh.createRow(1);
			cell=row.createCell(1);
			cell.setCellValue("City1");
			
			row=sh.createRow(2);
			cell=row.createCell(2);
			cell.setCellValue("City2");
			
			row=sh.createRow(3);
			cell=row.createCell(3);
			cell.setCellValue("Cityt3");
			
			row=sh.createRow(4);
			cell=row.createCell(4);
			cell.setCellValue("City4");
			
			row=sh.createRow(5);
			cell=row.createCell(5);
			cell.setCellValue("City5");
			
			row=sh.createRow(6);
			cell=row.createCell(6);
			cell.setCellValue("City6");
			
			
			row=sh.createRow(7);
			cell=row.createCell(7);
			cell.setCellValue("City7");
			
			row=sh.createRow(8);
			cell=row.createCell(8);
			cell.setCellValue("City8");
			
			row=sh.createRow(9);
			cell=row.createCell(9);
			cell.setCellValue("City9");
			
			row=sh.createRow(10);
			cell=row.createCell(10);
			cell.setCellValue("City10");
			
			row=sh.createRow(11);
			cell=row.createCell(11);
			cell.setCellValue("City11");
			
			row=sh.createRow(12);
			cell=row.createCell(12);
			cell.setCellValue("City12");
			
			row=sh.createRow(13);
			cell=row.createCell(13);
			cell.setCellValue("City13");
			
			row=sh.createRow(14);
			cell=row.createCell(14);
			cell.setCellValue("City14");
			
			row=sh.createRow(15);
			cell=row.createCell(15);
			cell.setCellValue("City15");
			
			row=sh.createRow(16);
			cell=row.createCell(16);
			cell.setCellValue("City16");
			
			row=sh.createRow(17);
			cell=row.createCell(17);
			cell.setCellValue("City17");
			
			row=sh.createRow(18);
			cell=row.createCell(18);
			cell.setCellValue("City18");
			
			row=sh.createRow(19);
			cell=row.createCell(19);
			cell.setCellValue("City19");
			
			row=sh.createRow(20);
			cell=row.createCell(20);
			cell.setCellValue("City20");
			
			
			
			
			fout=new FileOutputStream("C:\\Excel\\Example3.xlsx");
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

