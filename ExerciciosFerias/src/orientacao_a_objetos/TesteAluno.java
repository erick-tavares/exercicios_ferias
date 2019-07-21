package orientacao_a_objetos;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno1 = new Aluno ();
		aluno1.nome = "Bento Silva";
		aluno1.rg = "3456789";
		aluno1.dtNascimento = "23/08/2000";
				
		System.out.println("Nome: " + aluno1.nome + ". RG: " + aluno1.rg + ". Data de nascimento " + aluno1.dtNascimento);
		
		Aluno aluno2 = new Aluno ();
		aluno2.nome = "Carlos Silva";
		aluno2.rg = "3456776";
		aluno2.dtNascimento = "23/10/2000";
				
		System.out.println("Nome: " + aluno2.nome + ". RG: " + aluno2.rg + ". Data de nascimento " + aluno2.dtNascimento);
	
	}

}
