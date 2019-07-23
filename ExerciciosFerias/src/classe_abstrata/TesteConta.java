package classe_abstrata;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaPoupanca c = new ContaPoupanca();
		c.setTitular("Erick");
		c.setSaldo(3000);
		
		c.geraExtrato();
	}

}
