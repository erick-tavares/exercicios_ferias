package classe_abstrata;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario f = new Gerente();
		f.setNome("Arhur Tavares");
		f.setSalario(3500.0);
		
		f.bonificacao();
		
		System.out.println("Nome: " + f.getNome()+ ". Salário: " + f.getSalario()+ ". Bonificação: "+ f.bonificacao());
	}

}
