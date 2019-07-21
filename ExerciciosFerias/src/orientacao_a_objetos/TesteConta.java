package orientacao_a_objetos;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta conta1 =new Conta();
		Agencia ag1 = new Agencia ();
		ag1.numAgencia = 456;
		
		conta1.limite = 2000.00;
		conta1.saldo = 1500.00;
		conta1.numConta = 654321;
		conta1.ag = ag1;
		
		Conta conta2 =new Conta();
		Agencia ag2 = new Agencia ();
		ag2.numAgencia = 789;
		
		conta2.limite = 2500.00;
		conta2.saldo = 1800.00;
		conta2.numConta = 874321;
		conta2.ag = ag2;
		
		System.out.println("Agência: " + conta1.ag.numAgencia + ". Conta: " + conta1.numConta + ". Saldo: " + conta1.saldo + ". Limite: " + conta1.limite);
		System.out.println("Agência: " + conta2.ag.numAgencia + ". Conta: " + conta2.numConta + ". Saldo: " + conta2.saldo + ". Limite: " + conta2.limite);
	}

}
