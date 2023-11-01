package polimorfismo;

public class Pessoa {
	
	public String nome;
	
	public void apresentarNome() {
		System.out.println("Francisco");
	}

	public void apresentarNome(String sobreNome) {
		System.out.println("Francisco" + sobreNome);
	}
	
	public void apresentarNome(String sobreNome, boolean tornaMaiusculo) {
		if(tornaMaiusculo) {
			System.out.println(("Francisco" +  " " + sobreNome).toUpperCase());
		} else {
			apresentarNome(sobreNome);
		}
	}
	
}
