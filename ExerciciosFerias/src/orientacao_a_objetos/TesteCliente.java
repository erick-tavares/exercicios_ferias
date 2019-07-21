package orientacao_a_objetos;


public class TesteCliente {

	public static void main(String[] args) {

		ClienteBanco cli1 = new ClienteBanco();
		ClienteBanco cli2 = new ClienteBanco();
		cli1.nome = "Erick Tavares";
		cli1.cdCliente = 23425;
		
		cli2.cdCliente = 43567;
		cli2.nome = "Eduardo Tavares";
		
		System.out.println("Nome: " + cli1.nome + ". Cd:" + cli1.cdCliente);
		System.out.println("Nome: " + cli2.nome + ". Cd:" + cli2.cdCliente);

	}

}
