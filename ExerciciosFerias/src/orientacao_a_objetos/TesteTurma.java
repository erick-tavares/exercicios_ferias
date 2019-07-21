package orientacao_a_objetos;

public class TesteTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Turma turma1 = new Turma();
		turma1.materia = "Inglês";
		turma1.serie = "1º ano";
		turma1.periodo = "Noturno";
		turma1.sigla = "B";
		
		Turma turma2 = new Turma();
		turma2.materia = "Java";
		turma2.serie = "1º ano";
		turma2.periodo = "Noturno";
		turma2.sigla = "A";
		
		System.out.println("Classe: " + turma1.periodo + " " + turma1.sigla + "\n" + "Ensino: " + turma1.materia + " " + turma1.serie);
		System.out.println("Classe: " + turma2.periodo + " " + turma2.sigla + "\n" + "Ensino: " + turma2.materia + " " + turma2.serie);
		
	}

}
