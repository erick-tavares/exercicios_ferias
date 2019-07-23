package orientacao_a_objetos;

public class CartaoCredito {

	int numCartao;
	String validadeCartao;
	ClienteBanco cliente;
	
	CartaoCredito(int numCartao, String validadeCartao, ClienteBanco cliente) {
		this.numCartao = numCartao;
		this.validadeCartao = validadeCartao;
		this.cliente = cliente;

	}
}
