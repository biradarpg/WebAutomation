package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\employee.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("Name"));
	}

}
