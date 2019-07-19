package orientacao_a_objetos;

public class TesteAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Agencia ag1 = new Agencia ();
		ag1.numAgencia = 456;
		
		Agencia ag2 = new Agencia ();
		ag2.numAgencia = 789;
		
		System.out.println(ag1.numAgencia + "\n" + ag2.numAgencia);
	}

}
