package Static;

public class Secretaria extends Funcionario {

	private int ramal;

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	public void exibeDados() {
		System.out.println("Nome: "+getNome ()+". Sal�rio: " + getSalario() + ". Bonifica��o: "+bonificacao ()+ ". Ramal: "+ getRamal());
	}
}
