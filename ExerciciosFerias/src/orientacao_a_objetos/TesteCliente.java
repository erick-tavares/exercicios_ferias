package orientacao_a_objetos;


public class TesteCliente {

	public static void main(String[] args) {

		ClienteBanco cli1 = new ClienteBanco();
		ClienteBanco cli2 = new ClienteBanco();
		cli1.nome = "Erick Tavares";
		cli2.nome = "Eduardo Tavares";
		
		System.out.println(cli1.nome + "\n" + cli2.nome);

	}

}
