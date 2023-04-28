package com.sgtesting.excelASSignment01;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ASSIGNMENT01 {



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
			cell.setCellValue("Fruit");

			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("Fruit1");

			row=sh.createRow(2);
			cell=row.createCell(0);
			cell.setCellValue("Fruit2");

			row=sh.createRow(3);
			cell=row.createCell(0);
			cell.setCellValue("Fruit3");

			row=sh.createRow(4);
			cell=row.createCell(0);
			cell.setCellValue("Fruit4");

			row=sh.createRow(5);
			cell=row.createCell(0);
			cell.setCellValue("Fruit5");

			row=sh.createRow(6);
			cell=row.createCell(0);
			cell.setCellValue("Fruit6");


			row=sh.createRow(7);
			cell=row.createCell(0);
			cell.setCellValue("Fruit7");

			row=sh.createRow(8);
			cell=row.createCell(0);
			cell.setCellValue("Fruit8");

			row=sh.createRow(9);
			cell=row.createCell(0);
			cell.setCellValue("Fruit9");

			row=sh.createRow(10);
			cell=row.createCell(0);
			cell.setCellValue("Fruit10");

			row=sh.createRow(11);
			cell=row.createCell(0);
			cell.setCellValue("Fruit11");

			row=sh.createRow(12);
			cell=row.createCell(0);
			cell.setCellValue("Fruit12");

			row=sh.createRow(13);
			cell=row.createCell(0);
			cell.setCellValue("Fruit13");

			row=sh.createRow(14);
			cell=row.createCell(0);
			cell.setCellValue("Fruit14");

			row=sh.createRow(15);
			cell=row.createCell(0);
			cell.setCellValue("Fruit15");

			row=sh.createRow(16);
			cell=row.createCell(0);
			cell.setCellValue("Fruit16");

			row=sh.createRow(17);
			cell=row.createCell(0);
			cell.setCellValue("Fruit17");

			row=sh.createRow(18);
			cell=row.createCell(0);
			cell.setCellValue("Fruit18");

			row=sh.createRow(19);
			cell=row.createCell(0);
			cell.setCellValue("Fruit19");

			row=sh.createRow(20);
			cell=row.createCell(0);
			cell.setCellValue("Fruit20");




			fout=new FileOutputStream("C:\\Excel\\Example.xlsx");
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


