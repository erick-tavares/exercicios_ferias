package Static;

public class Telefonista extends Funcionario{

	private String cdEstacao;

	public String getCdEstacao() {
		return cdEstacao;
	}

	public void setCdEstacao(String cdEstacao) {
		this.cdEstacao = cdEstacao;
	}
	public void exibeDados() {
		System.out.println("Nome: "+getNome ()+". Sal�rio: " + getSalario() + ". Bonifica��o: "+bonificacao ()+ ". C�digo da esta��o de trabalho: " + getCdEstacao());
	}
	
}
