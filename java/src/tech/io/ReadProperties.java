package tech.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This is demo for reading properties file from current package.
 * 
 * @author anshu.kumar
 *
 */
public class ReadProperties {
	public static void main(String[] args){
		/** loading resource using getResourceAsStream(String name); */
			readConfigPropertiesFile();
	}

	private static void readConfigPropertiesFile() {
		InputStream in = ReadProperties.class.getResourceAsStream("config.properties");
		
		Properties config = new Properties();
		
		try {
			config.load(in);
			System.out.println(config.getProperty("database"));
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
