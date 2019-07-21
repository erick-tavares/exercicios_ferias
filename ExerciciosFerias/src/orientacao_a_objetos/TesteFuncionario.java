package orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario func1 = new Funcionario();
		func1.nome = "Alício Cunha";
		func1.salario = 8000.0;
		
		System.out.println("Nome: " + func1.nome + ". Salário: " + func1.salario);

		Funcionario func2 = new Funcionario();
		func2.nome = "Edwin Bramchen";
		func2.salario = 8000.0;
		
		System.out.println("Nome: " + func2.nome + ". Salário: " + func2.salario);
		
		System.out.println(" ");
		//
		
		func1.aumentaSalario(600);
		func1.dadosFuncionario();
		
		
	}

}
