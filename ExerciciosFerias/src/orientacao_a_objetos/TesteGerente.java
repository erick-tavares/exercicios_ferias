package orientacao_a_objetos;

public class TesteGerente {

	public static void main(String[] args) {
	Gerente g = new Gerente ();
	g.salario = 2000.0;
			
	g.aumentaSalario();
	System.out.println("Sal�riocom aumento de 10%: " + g.salario);
	
	g.salario = 2000;
	
	g.aumentaSalario(0.2);

	System.out.println("Sal�riocom aumento de 20%: " + g.salario);
	}

}
