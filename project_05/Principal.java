package aulaRevisao;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[]args) {
		
		Disciplina d1 = new Disciplina();
		d1.nome = "Estrutura de Dados";
		d1.codigo = 123;
		d1.quantidade = 20;
		
		Disciplina d2 = new Disciplina();
		d2.nome = "Banco de Dados";
		d2.codigo = 124;
		d2.quantidade = 30;
		
		Disciplina d3 = new Disciplina();
		d3.nome = "Algebra";
		d3.codigo = 125;
		d3.quantidade = 12;
		
		Disciplina d4 = new Disciplina();
		d4.nome = "Sistemas Operacionais";
		d4.codigo = 126;
		
		ArrayList<Disciplina> segundoSemestre =
				new ArrayList<>();
		
		segundoSemestre.add(d1);
		segundoSemestre.add(d2);
		segundoSemestre.add(d3);
		
		for(int i = 0; i < segundoSemestre.size(); i++) {
			if(segundoSemestre.get(i).quantidade >= 20) {
			System.out.println(segundoSemestre.get(i));	
		}
	}	
	
  }

}
