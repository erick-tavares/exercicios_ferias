package orientacao_a_objetos;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta conta1 =new Conta();
		conta1.limite = 2000.00;
		conta1.saldo = 1500.00;
		conta1.numConta = 654321;
		
		Conta conta2 =new Conta();
		conta2.limite = 2500.00;
		conta2.saldo = 1800.00;
		conta2.numConta = 874321;
	
		System.out.println("Conta: " + conta1.numConta + ". Saldo: " + conta1.saldo + ". Limite: " + conta1.limite);
		System.out.println("Conta: " + conta2.numConta + ". Saldo: " + conta2.saldo + ". Limite: " + conta2.limite);
	}

}
