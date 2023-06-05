package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileLib1 {
	
	public String getPropertyData (String property) throws IOException
	{
		FileInputStream fis = new FileInputStream ("./src/main/resources/driver/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		
		String data=p.getProperty(property);
		return data;
		
		
		
	}
	

	
}
