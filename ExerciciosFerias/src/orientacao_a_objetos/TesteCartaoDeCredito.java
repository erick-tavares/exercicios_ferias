package orientacao_a_objetos;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {
		CartaoCredito cred1 = new CartaoCredito();
		ClienteBanco cli1 = new ClienteBanco();
		cli1.nome = "Erick Tavares";
		
		cred1.numCartao = 123456;
		cred1.validadeCartao = "12/10/2022";
		cred1.cliente = cli1;
		
		CartaoCredito cred2 = new CartaoCredito();
		ClienteBanco cli2 = new ClienteBanco();
		cli2.nome = "Eduardo Tavares";
		
		cred2.numCartao = 123789;
		cred2.validadeCartao = "12/11/2022";
		cred2.cliente = cli2;

		
		System.out.println("Cliente: " + cred1.cliente.nome + ". Nº do cartão: " + cred1.numCartao + "\n" + "Validade do cartão: " + cred1.validadeCartao);
		System.out.println("Cliente: " + cred2.cliente.nome + "Nº do cartão: " + cred2.numCartao + "\n" + "Validade do cartão: " + cred2.validadeCartao);
	}

}
