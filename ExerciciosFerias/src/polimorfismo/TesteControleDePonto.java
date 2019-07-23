package polimorfismo;

public class TesteControleDePonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ControleDePonto cdp = new ControleDePonto();
		Funcionario f = new Gerente();
		f.setNome("Arthur");
		
		Funcionario f2 = new Telefonista();
		f2.setNome("Carolina");
		
		cdp.registraEntrada(f);
		cdp.registraSaida(f);
		
		cdp.registraEntrada(f2);
		cdp.registraSaida(f2);
	}

}
