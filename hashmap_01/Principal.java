package project_06;

import java.util.HashMap;

public class Principal {
	
	public static void main(String[]args) {
		// Criar um objeto HashMap chamado capitalCities
		HashMap<String, String> 
		capitais = new HashMap<String, String>();
		// Add keys and values (Country, City)
		capitais.put("England", "London");
		capitais.put("Germany", "Berlin");
		capitais.put("Nowway", "Oslo");
		capitais.put("USA", "Washington DC");

		// System.out.println(capitais); PEGA AS RESPECTIVAS CAPITAIS
		// System.out.println(capitais.get("England")); PEGA SOMENTE A CAPITAL DE ENGLAND, LOGO, LONDON.
		for (String i : capitais.keySet()) {
			System.out.println("key: " + i + " value: " + capitais.get(i));
			//System.out.println(i); // imprime as keySet das capitais, os países.
		}
	}
	

}
