package classe_abstrata;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
	
	public void geraExtrato (){
	
		Date agora = new Date();
		System.out.println(sdf.format(agora));
		System.out.println("Títular: " + getTitular());
		System.out.println("Saldo: " + getSaldo());
	}

}
