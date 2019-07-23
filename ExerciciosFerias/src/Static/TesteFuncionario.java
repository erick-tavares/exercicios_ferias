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
		
		System.out.println("Gerente: " + g.getNome());
		System.out.println("Salário: " + g.getSalario());
		System.out.println("Senha: " + g.getSenha());
		g.bonificacao(0.10);
		
		System.out.println("Secretaria: " + s.getNome());
		System.out.println("Salário: " + s.getSalario());
		System.out.println("Ramal: " + s.getRamal());
		s.bonificacao(0.10);
		
		System.out.println("Telefonista: " + t.getNome());
		System.out.println("Salário: " + t.getSalario());
		System.out.println("Estação de trabalho: " + t.getCdEstacao());
		t.bonificacao(0.10);
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
