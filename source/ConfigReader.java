package source;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	private Properties configfic;// fichier de configuration .properties
	
	public void read() {
		configfic = new Properties();
		InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("source/config.properties");
		// on peut remplacer ConfigReader.class par getClass()
		try {
			configfic.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getVal(String name) {
		return configfic.getProperty(name);
	}
	
}
