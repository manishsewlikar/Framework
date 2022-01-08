package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperty {

	/**
	 * @param args
	 */
	public static String getResources(String key) 
	{
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		InputStream input = null;
		String path=null;
		try {

			input = new FileInputStream("TestProperty.properties");

			// load a properties file
			prop.load(input);
			
			path=prop.getProperty(key);

			// get the property value and print it out
			System.out.println(path);
			//System.out.println(prop.getProperty("dbuser"));
			//System.out.println(prop.getProperty("dbpassword"));

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
      return path;
	}

}
