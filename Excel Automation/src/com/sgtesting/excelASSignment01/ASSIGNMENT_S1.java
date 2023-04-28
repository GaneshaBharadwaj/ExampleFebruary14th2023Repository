package com.sgtesting.excelASSignment01;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ASSIGNMENT_S1 {

	public static void main(String[] args) {
		 Fruits();
	}
		private static void Fruits()
		{
			FileOutputStream fout=null;
			Workbook wb=null;
			Sheet sh=null;
			Row row=null;
			Cell cell=null;
			
		     try
		     {
		    	 wb=new XSSFWorkbook();
		    	 sh=wb.createSheet("Information");
		    	 row=sh.createRow(0);
		    	 cell=row.createCell(0);
		    	 cell.setCellValue("Fruits Name");
		    	 
		    	 for(int i=1;i<=20; i++)
		    	 {
		    		 row=sh.createRow(i+1);
			    	 cell=row.createCell(0);
			    	 cell.setCellValue("Fruit Name"+i);
	        	 //System.out.println("Fruits name"+i);
	        	 fout=new FileOutputStream("E:\\Excel\\FruitName.xlsx");
		    	 wb.write(fout);
		    	 
		    	 
		    	 //System.out.println("Fruits name");
		    	 }
		     }
		     catch(Exception e)
		 	{
		 		e.printStackTrace();
		 	}
		 	finally
		 	{
		 		try {
		 			fout.close();
		 			wb.close();
		 			
		 		} catch (Exception e) {
		 			e.printStackTrace();
		 			
		 		}
		 	}
		}
	



}
