package client;

import source.ConfigReader;

public class Application {

	public static void main(String[] args) {
		ConfigReader configreader = new ConfigReader();
		configreader.read();
		System.out.println(configreader.getVal("nom"));
		System.out.println(configreader.getVal("prenom")); 
		System.out.println(configreader.getVal("prenom"));
	}

}
