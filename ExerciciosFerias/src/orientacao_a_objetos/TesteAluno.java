package orientacao_a_objetos;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno1 = new Aluno ();
		Turma turma1 = new Turma();
		turma1.setMateria("Java");
		turma1.setSerie("1º ano");
		turma1.setPeriodo("Noturno");
		turma1.setSigla("A");
		
		aluno1.setTurma(turma1);
		aluno1.setNome("Bento Silva");
		aluno1.setRg("3456789");
		aluno1.setDtNascimento("23/08/2000");
				
		System.out.println("Nome: " + aluno1.getNome() + "\n" + "Turma: " + aluno1.getTurma().getMateria() +  
				". Série: " + aluno1.getTurma().getSerie() + ". Período: " + aluno1.getTurma().getPeriodo() + ". Sigla: " + aluno1.getTurma().getSigla());
		
		Aluno aluno2 = new Aluno ();
		Turma turma2 = new Turma();
		turma2.setMateria("Java");
		
		aluno2.setTurma(turma2);
		aluno2.setNome("Carlos Silva");
		aluno2.setRg("3456776");
		aluno2.setDtNascimento("23/10/2000");
				
		System.out.println("Turma: " + aluno2.getTurma().getMateria() + ". Nome: " + aluno2.getNome() + ". RG: " + aluno2.getRg() + ". Data de nascimento " + aluno2.getDtNascimento());
	
	}

}
