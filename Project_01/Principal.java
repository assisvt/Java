package aula2;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Francisco Molina";
		p1.ra = "123456";
		p1.idade = 40;
		System.out.println(p1.nome);
		p1.responderChamada(1);
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Vitor Assis";
		p2.ra = "22304737";
		p2.idade = 23;
		System.out.println(p2.nome);
		p2.responderChamada(0);
	}
}
