package orientacao_a_objetos;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {
		
		ClienteBanco cli1 = new ClienteBanco();
		cli1.setNome("Erick Tavares");
		CartaoCredito cred1 = new CartaoCredito(123456, "12/10/2022", cli1);
		
		ClienteBanco cli2 = new ClienteBanco();
		cli2.setNome("Eduardo Tavares");
		CartaoCredito cred2 = new CartaoCredito(123789, "12/11/2022", cli2 );
		
		System.out.println("Cliente: " + cred1.getCliente().getNome() + ". Nº do cartão: " + cred1.getNumCartao() + "\n" + "Validade do cartão: " + cred1.getValidadeCartao());
		System.out.println("Cliente: " + cred2.getCliente().getNome() + "Nº do cartão: " + cred2.getNumCartao() + "\n" + "Validade do cartão: " + cred2.getValidadeCartao());
	}

}
