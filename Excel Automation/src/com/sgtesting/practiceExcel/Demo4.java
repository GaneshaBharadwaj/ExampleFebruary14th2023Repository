package com.sgtesting.practiceExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo4 {

	public static void main(String[] args) {
		READ_WRITE();

	}
	private static void READ_WRITE()
	{
		FileInputStream fin=null;
		FileOutputStream fout= null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row rowsh1=null;
		Row rowsh2=null;
		Cell cellsh1=null;
		Cell cellsh2=null;
		try
		{
			fin=new FileInputStream("C:\\Excel_new\\hello.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet0");
			sh2=wb.getSheet("Sheet1");
			if(sh2==null)
			{
				wb.createSheet("Sheet1");
			}
			int rc=sh1.getPhysicalNumberOfRows();
			for(int i=0;i<rc;i++)
			{
				rowsh1=sh1.getRow(i);
				rowsh2=sh2.getRow(i);
				if(rowsh2==null)
				{
					rowsh2=sh2.createRow(i);
				}

				int cc=rowsh1.getPhysicalNumberOfCells();
				for(int j=0;j<cc;j++)
				{
					cellsh1=rowsh1.getCell(j);
					cellsh2=rowsh2.getCell(j);
					if(cellsh2==null)
					{
						cellsh2=rowsh2.createCell(j);
					}
				}
				String data=cellsh1.getStringCellValue();
				cellsh2.setCellValue(data);
			}
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
