package orientacao_a_objetos;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno1 = new Aluno ();
		Turma turma1 = new Turma();
		turma1.materia = "Java";
		turma1.serie = "1º ano";
		turma1.periodo = "Noturno";
		turma1.sigla = "A";
		
		aluno1.turma = turma1;
		aluno1.nome = "Bento Silva";
		aluno1.rg = "3456789";
		aluno1.dtNascimento = "23/08/2000";
				
		System.out.println("Nome: " + aluno1.nome + "\n" + "Turma: " + aluno1.turma.materia +  
				". Série: " + aluno1.turma.serie + ". Período: " + aluno1.turma.periodo + ". Sigla: " + aluno1.turma.sigla);
		
		Aluno aluno2 = new Aluno ();
		Turma turma2 = new Turma();
		turma2.materia = "Java";
		
		aluno2.turma = turma2;
		aluno2.nome = "Carlos Silva";
		aluno2.rg = "3456776";
		aluno2.dtNascimento = "23/10/2000";
				
		System.out.println("Turma: " + aluno2.turma.materia + ". Nome: " + aluno2.nome + ". RG: " + aluno2.rg + ". Data de nascimento " + aluno2.dtNascimento);
	
	}

}
