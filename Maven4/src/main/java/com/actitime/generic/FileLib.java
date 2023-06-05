package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String getProprtyData(String property) throws IOException

	{
		FileInputStream fs= new FileInputStream("./data/commondata.property");
		Properties p= new Properties();
		p.load(fs);

		String data = p.getProperty(property);
		return data;		
	}
	
public String getExcelData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
{
	FileInputStream fs= new FileInputStream("./data/testdata.xlsx");

	Workbook wb = WorkbookFactory.create(fs);
	String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return data;
	
}
}
