package Static;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new Conta();
		System.out.println("Número da conta: " + c1.numeroDeConta);
		
		Conta c2 = new Conta();
		System.out.println("Número da conta: " + c2.numeroDeConta);
		
		Conta.zerarContador();
		
		
	}

}
