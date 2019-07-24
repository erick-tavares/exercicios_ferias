package Interface;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GerarExtrato g = new GerarExtrato();
		

		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setTitular("Arthur Tavares");
		cp.setSaldo(5000.0);
		
		ContaCorrente cc = new ContaCorrente();
		cc.setTitular("Erick Tavares");
		cc.setSaldo(2000.0);
		
		System.out.println("Conta corrente");
		
		g.gerarExtrato(cc);
		cc.deposita(500);
		g.gerarExtrato(cc);
		
		System.out.println("Conta poupança");
		g.gerarExtrato(cp);
		cp.saque(600);
		g.gerarExtrato(cp);
	
	}

}
