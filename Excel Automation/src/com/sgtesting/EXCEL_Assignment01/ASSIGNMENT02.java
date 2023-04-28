package com.sgtesting.EXCEL_Assignment01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ASSIGNMENT02 {

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
			fin=new FileInputStream("C:\\Excel_new\\Hello1.xlsx");
			wb=new XSSFWorkbook(fin);
			
			sh1=wb.getSheet("sheet1");
			sh2=wb.getSheet("sheet2");
			if(sh2==null)
			{
				wb.createSheet("sheet2");
			}
			
			int rc=sh1.getPhysicalNumberOfRows();
			for(int i=0;i<rc;i++)
			{
				rowsh1=sh1.getRow(i);
				cellsh1=rowsh1.getCell(i);
				
				rowsh2=sh2.getRow(9);
				if(rowsh2==null)
				{
					rowsh2=sh2.createRow(9);
					
				}
				
				int cc=rowsh2.getPhysicalNumberOfCells();
				for(int j=0;j<cc;j++)
				{
					cellsh2=rowsh2.getCell(j);
					if(cellsh2==null)
					{
						cellsh2=rowsh2.createCell(i);
					
					}
						
				}
				
				
				String data=cellsh1.getStringCellValue();
				cellsh2.setCellValue(data);
				
				
				
			}
			fout=new FileOutputStream("C:\\Excel_new\\Hello1.xlsx");
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
