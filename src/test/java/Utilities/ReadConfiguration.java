package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfiguration {

	Properties pro;
	public ReadConfiguration()
	{
		File src=new File("./Configuration\\config.properties");
		try {
			FileInputStream fistream=new FileInputStream(src);
			pro=new Properties();
			pro.load(fistream);
			}catch(Exception e)
		{
				System.out.println("exception occured");
		}
		
	}
	public String readurl()
	{
		String url=pro.getProperty("baseurl");
		return url;
	}
	public String getchromepath()
	{
		String path=pro.getProperty("chromepath");
		return path;
	}
	
	
	
	
}
