package orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario func1 = new Funcionario();
		func1.setNome("Al�cio Cunha");
		func1.setSalario(8000.0);
		
		System.out.println("Nome: " + func1.getNome() + ". Sal�rio: " + func1.getSalario());

		Funcionario func2 = new Funcionario();
		func2.setNome("Edwin Bramchen");
		func2.setSalario(8000.0);
		
		System.out.println("Nome: " + func2.getNome() + ". Sal�rio: " + func2.getSalario());
		
		System.out.println(" ");
		//
		
		func1.aumentaSalario(600);
		func1.dadosFuncionario();
		
		
	}

}
