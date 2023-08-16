package exemploLista;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		Figura f1 = new Figura();
		f1.nome = "Quadrado";
		f1.nrlados = 4;
		f1.tipo = "Quadrilátero";
		
		Figura f2 = new Figura();
		f2.nome = "Pentagono";
		f2.nrlados = 5;
		
		
		Figura f3 = new Figura();
		f3.nome = "Triângulo";
		f3.nrlados = 3;
		
		Figura f4 = new Figura();
		f4.nome = "Hexágono";
		f4.nrlados = 6;
		
		Figura f5 = new Figura();
		f5.nome = "Heptágono";
		f5.nrlados = 3;
		
		ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
		
		System.out.println("O tamanho da lista é:"
				+ listaFiguras.size());
		
		listaFiguras.add(f1);
		listaFiguras.add(f2);
		listaFiguras.add(f3);
		listaFiguras.add(f4);
		listaFiguras.add(f5);
		
		System.out.println("O tamanho da lista é:"
						+listaFiguras.size());
		
		for (int i = 0; i < listaFiguras.size(); i++) {
			System.out.println(listaFiguras.get(i).nome);
			System.out.println(listaFiguras.get(i).nrlados);
			System.out.println(listaFiguras.get(i).tipo);
			
		}
	}

}
