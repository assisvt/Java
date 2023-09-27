package aula_10;

public class Principal {
	
	public static void main(String[] args) {
		
		PF pf1 = new PF();
		pf1.idade = 40;
		pf1.setCpf("09856434-78");
		pf1.setNome("Francisco Molina");
		pf1.data = "05/03/1983";
		
		PJ pj1 = new PJ();
		pj1.cnpj = "07865674-98";
		pj1.data = "01/02/2021";
		pj1.idade = 2;
		pj1.setNome("Google");
		
		System.out.println(pf1.getNome());
		System.out.println(pj1.getNome());
		
		
	}

}
