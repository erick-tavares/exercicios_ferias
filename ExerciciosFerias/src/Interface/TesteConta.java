package Interface;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaPoupanca cp = new ContaPoupanca("Arthur Tavares", 5000.0);
		ContaCorrente cc = new ContaCorrente("Erick Tavares", 2000.0);
		
		System.out.println(cp.saldo);
		cp.deposita(500);
		System.out.println(cp.saldo);
		
		System.out.println(cc.saldo);
		cc.saque(800);
		System.out.println(cc.saldo);
	
		
	
	}

}
