package orientacao_a_objetos;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {
		
		ClienteBanco cli1 = new ClienteBanco();
		cli1.nome = "Erick Tavares";
		CartaoCredito cred1 = new CartaoCredito(123456, "12/10/2022", cli1);
		
		ClienteBanco cli2 = new ClienteBanco();
		cli2.nome = "Eduardo Tavares";
		CartaoCredito cred2 = new CartaoCredito(123789, "12/11/2022", cli2 );
		
		System.out.println("Cliente: " + cred1.cliente.nome + ". Nº do cartão: " + cred1.numCartao + "\n" + "Validade do cartão: " + cred1.validadeCartao);
		System.out.println("Cliente: " + cred2.cliente.nome + "Nº do cartão: " + cred2.numCartao + "\n" + "Validade do cartão: " + cred2.validadeCartao);
	}

}
