package orientacao_a_objetos;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {
		CartaoCredito cred1 = new CartaoCredito();
		cred1.numCartao = 123456;
		cred1.validadeCartao = "12/10/2022";
		
		CartaoCredito cred2 = new CartaoCredito();
		cred2.numCartao = 123789;
		cred2.validadeCartao = "12/11/2022";

		
		System.out.println("N� do cart�o: " + cred1.numCartao + "\n" + "Validade do cart�o: " + cred1.validadeCartao);
		System.out.println("N� do cart�o: " + cred2.numCartao + "\n" + "Validade do cart�o: " + cred2.validadeCartao);
	}

}
