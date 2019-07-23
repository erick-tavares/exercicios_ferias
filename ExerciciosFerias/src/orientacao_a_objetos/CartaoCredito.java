package orientacao_a_objetos;

public class CartaoCredito {

	private int numCartao;
	private String validadeCartao;
	private ClienteBanco cliente;
	
	CartaoCredito(int numCartao, String validadeCartao, ClienteBanco cliente) {
		this.numCartao = numCartao;
		this.validadeCartao = validadeCartao;
		this.cliente = cliente;

	}

	public int getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}

	public String getValidadeCartao() {
		return validadeCartao;
	}

	public void setValidadeCartao(String validadeCartao) {
		this.validadeCartao = validadeCartao;
	}

	public ClienteBanco getCliente() {
		return cliente;
	}

	public void setCliente(ClienteBanco cliente) {
		this.cliente = cliente;
	}
}
