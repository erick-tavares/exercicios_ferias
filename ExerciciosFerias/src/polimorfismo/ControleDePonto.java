package polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {

	static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy - HH:mm:ss");

	public void registraEntrada(Funcionario f) {
		Date agora = new Date();
		System.out.println("ENTRADA: " + f.getNome());
		System.out.println("DATA: " + sdf.format(agora));
		}

		public void registraSaida ( Funcionario f ) {
		Date agora = new Date();
		System.out.println("SAÍDA: " + f.getNome());
		System.out.println("DATA: " + sdf.format(agora));
		}

}
