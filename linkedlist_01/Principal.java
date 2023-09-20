package linkedlist_01;

import java.util.LinkedList;

public class Principal {
	public static void main(String[] args) {
		LinkedList<String> 
		cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Corolla");
		
		// cars.addFirst(); TO ADD THE ITEM TO THE BEGINNING. EX: cars.addFirst("Mazda");
		// cars.addLast(); 
		// removeFirst();  
		//~+~ System.out.println(cars); PRINT PARA CADA UM DOS ACIMA
		
		//System.out.println(cars.getFirst()); // car.getLast(); PRINTARIA O COROLLA 
		
		for (String i : cars) {
			System.out.println(i);
		}
	}

}
