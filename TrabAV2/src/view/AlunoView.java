/*Rayná Araújo Reveles - 0050013521*/

package view;

import java.util.List;
import java.util.Scanner;
import bo.Aluno;
import controller.AlunoController;

public class AlunoView {
	
	public void create(String matricula, String nome, String cidade) {
		
		
		Aluno aluno = new Aluno();
		
		
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setCidade(cidade);
		
		AlunoController controller = new AlunoController();
		controller.create(aluno);
	}
	
	public List<Aluno> read() {
		
		AlunoController controller = new AlunoController();
		
		
		return controller.read();

	}
	
	
public int update(String matricula, String Novonome, String Novacidade) {
		
		
		Aluno aluno = new Aluno();
		
		
		aluno.setMatricula(matricula);
		aluno.setNome(Novonome);
		aluno.setCidade(Novacidade);
		
		AlunoController controller = new AlunoController();
		int feedback = controller.update(aluno);
		return feedback;
		
	}


public int delete(String matricula) {
	
	
	AlunoController controller = new AlunoController();
	int feedback = controller.delete(matricula);
	return feedback;
}
	
	

}
