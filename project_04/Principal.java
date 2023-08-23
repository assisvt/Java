package project_04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {

		Mercadoria m1 = new Mercadoria();
		m1.nome = "Televisão";
		m1.codigo = 123;
		m1.preco = 1000.50;
		
//		Scanner in = new Scanner(System.in);
//		Mercadoria m2 = new Mercadoria();
//		
//		System.out.println("Informe o nome do produto: ");
//		m2.nome = in.next(); /* next 'aguardando o enter pra pedir o prox'*/
//		System.out.println("Informe o código do produto: ");
//		m2.codigo = in.nextInt();
//		System.out.println("Informe o preço do produto: ");
//		m2.preco = in.nextDouble();
//		
//		System.out.println(m2.nome);
//		System.out.println(m2.codigo);
//		System.out.println(m2.preco);
		
		Mercadoria m3 = new Mercadoria();
		m3.nome = JOptionPane.showInputDialog("Informe o nome: ");
		m3.codigo = Integer.valueOf(
				JOptionPane.showInputDialog("Informe o código: "));
		m3.preco = Double.valueOf(
				JOptionPane.showInputDialog("Informe o preço")); /* usar ponto em vez de vírgula*/
		
		JOptionPane.showMessageDialog(null, m3.toString()); 
		
//		System.out.println(m3.nome);
//		System.out.println(m3.codigo);
//		System.out.println(m3.preco);
		
	}

}
