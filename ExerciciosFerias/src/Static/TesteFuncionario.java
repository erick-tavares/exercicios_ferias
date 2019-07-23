package Static;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario func1 = new Funcionario();
			func1.salario = 2000.0;
			
		System.out.println(func1.valeRefeicaoDiario);
		
		func1.reajusteValeRefeicaoDiario(0.22);
		
		System.out.println("Vale refeição com reajuste: " + func1.valeRefeicaoDiario);
	}

}
