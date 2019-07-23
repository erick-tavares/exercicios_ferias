package Static;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerente g = new Gerente();
		g.setNome("Arthur Tavares");
		g.setSalario(5000.0);
		g.setSenha("23456");
		
		Secretaria s = new Secretaria();
		s.setNome("Carolina Wippel");
		s.setSalario(2300.0);
		s.setRamal(34);
		
		Telefonista t = new Telefonista();
		t.setNome("Maria Silva");
		t.setSalario(2200.0);
		t.setCdEstacao("456");
		
		g.exibeDados();
		s.exibeDados();
		t.exibeDados();
	
		/*
		Funcionario func1 = new Funcionario();
			func1.setSalario(2000);
			func1.setNome("Arthur");
			
		System.out.println(func1.valeRefeicaoDiario);
		func1.reajusteValeRefeicaoDiario(0.22);
		System.out.println("Vale refeição com reajuste: " + func1.valeRefeicaoDiario);
		*/
	}

}
