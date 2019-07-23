package orientacao_a_objetos;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Agencia ag1 = new Agencia (456);
		Conta conta1 =new Conta(654321,1500.0,2000.0, ag1);
		
		Agencia ag2 = new Agencia (789);
		Conta conta2 =new Conta(874321, 2500.0, 2500.0, ag2);
		/*
		System.out.println("Agência: " + conta1.ag.numAgencia + ". Conta: " + conta1.numConta + ". Saldo: " + conta1.saldo + ". Limite: " + conta1.limite);
		System.out.println("Agência: " + conta2.ag.numAgencia + ". Conta: " + conta2.numConta + ". Saldo: " + conta2.saldo + ". Limite: " + conta2.limite);
		
		System.out.println(" ");		
		conta1.impressaoDeExtrato();
		
		System.out.println("Deposito de 100 reais");
		conta1.deposito(100.00);		
		
		System.out.println(conta1.saldo);
		conta1.impressaoDeExtrato();	
		
		System.out.println("Saque de 300 reais");
		conta1.saque(300.00);
		System.out.println(conta1.saldo);
		System.out.println("limite disponível: " + conta1.consultaSaldo());
		 */
		conta1.impressaoDeExtrato();
		conta2.impressaoDeExtrato();
		
		conta1.transferencia(conta2 , 550.0);
		
		System.out.println("Transferência realizada");
		conta1.impressaoDeExtrato();
		conta2.impressaoDeExtrato();
	}

}
