package orientacao_a_objetos;

import util.Teclado;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		Funcionario func = new Funcionario ();
		func.setNome(Teclado.lerTexto("Digite o nome do funcionário"));
		
		func.dadosFuncionario();
		
		func.dadosFuncionario(" ", 0.0);
		
		func.dadosFuncionario();
	}

}
