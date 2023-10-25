package trabalho;

import javax.swing.JOptionPane;

public class Principal {
	
	public static int lista[] = {1,5,2,3,6};
	
	public static void main(String[] args) {
		apresentaOpcoes();
	}
	
	public static void apresentarListaOriginal() {
		String original = "";
		for (int i = 0; i < lista.length; i++) {
			original += lista[i] + " ";
		}
		JOptionPane.showMessageDialog(null, original);
		apresentaOpcoes();
	}
	
	public static void preencherLista() {
		JOptionPane.showMessageDialog(null, "Lista Preenchida!");
		apresentaOpcoes();
	}
	
	public static void ordenarLista() {
		JOptionPane.showMessageDialog(null, "Lista ordenada!");
	}
	
	public static void apresentaOpcoes() {
		String opcao = JOptionPane.showInputDialog(
			" 1 - Preencher lista \n" +
			" 2 - Ordenar lista \n" +
			" 3 - Apresentar comparação \n" +
			" 4 - Apresentar lista original \n" +
			" 5 - Sair "
		);
		
		if(opcao.equals("1")) {
			preencherLista();
		} else if (opcao.equals("2")) {
			ordenarLista();
		} else if (opcao.equals("4")) {
			apresentarListaOriginal();
		} else {
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		}
	}

}

