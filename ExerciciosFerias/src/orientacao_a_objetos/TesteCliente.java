package orientacao_a_objetos;


public class TesteCliente {

	public static void main(String[] args) {

		ClienteBanco cli1 = new ClienteBanco();
		ClienteBanco cli2 = new ClienteBanco();
		cli1.setNome("Erick Tavares");
		cli1.setCdCliente(23425);
		
		cli2.setCdCliente(43567);
		cli2.setNome("Eduardo Tavares");
		
		System.out.println("Nome: " + cli1.getNome() + ". Cd:" + cli1.getCdCliente());
		System.out.println("Nome: " + cli2.getNome() + ". Cd:" + cli2.getCdCliente());

	}

}
