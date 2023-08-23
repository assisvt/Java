package project_04;

public class Mercadoria {

	public String nome;
	public double preco; /*float*/
	public int codigo;
	
	@Override
	public String toString() {
		return this.nome.toUpperCase() + " R$ " 
				+ this.preco + " - " + this.codigo;
	}
	
}
