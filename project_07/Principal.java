package project_07;

public class Principal {
	
	public static void main(String[] args) {
		
		Futebol f = new Futebol();
		f.setCampeonato("Libertadores");
		f.setPatrocinio("Nike");
		f.setTime("Fluminense");
		
		System.out.println(f.toString());
		
	}

}
