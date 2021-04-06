import java.util.Scanner;

public class TesterAluno{
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
	
	System.out.println("Entre com nome: ");
	aluno.setNome(teclado.next());
	
	System.out.println("Entre com matrícula: ");
	aluno.setMatricula(teclado.next());
	
	System.out.println("Entre com curso: ");
	aluno.setCurso(teclado.next());
	
	aluno.listar();
	teclado.close();
	
	}
	
}
