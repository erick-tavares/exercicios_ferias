package orientacao_a_objetos;

public class TesteTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Turma turma1 = new Turma();
		turma1.setMateria("Ingl�s");
		turma1.setSerie("1� ano");
		turma1.setPeriodo("Noturno");
		turma1.setSigla("B");
		
		Turma turma2 = new Turma();
		turma2.setMateria("Java");
		turma2.setSerie("1� ano");
		turma2.setPeriodo("Noturno");
		turma2.setSigla("A");
		
		System.out.println("Classe: " + turma1.getPeriodo() + " " + turma1.getSigla() + "\n" + "Ensino: " + turma1.getMateria() + " " + turma1.getSerie());
		System.out.println("Classe: " + turma2.getPeriodo() + " " + turma2.getSigla() + "\n" + "Ensino: " + turma2.getMateria() + " " + turma2.getSerie());
		
	}

}
