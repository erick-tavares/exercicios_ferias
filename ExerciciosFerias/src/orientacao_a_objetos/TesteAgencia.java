package orientacao_a_objetos;

public class TesteAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Agencia ag1 = new Agencia (456);
		
		Agencia ag2 = new Agencia (789);
		
		System.out.println(ag1.getNumAgencia() + "\n" + ag2.getNumAgencia());
	}

}
