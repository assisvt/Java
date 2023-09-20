package hashmap2;

import java.util.HashMap;

public class Principal {
	public static void main(String[] args) {
		// Create a HashMap object called people
		HashMap<String, Integer> 
		people = new HashMap<String, Integer>();
		// Add keys and values (Name, Age)
		people.put("Vítor", 23);
		people.put("João Pedro", 24);
		people.put("Maristela", 61);
		for (String i : people.keySet()) {
			System.out.println("key: " + i + " value: " + people.get(i));
		}
	}

}
