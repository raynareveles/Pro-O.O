/*Rayná Araújo Reveles - 0050013521*/

package controller;


import java.util.ArrayList;
import java.util.List;

import bo.Aluno;
import model.AlunoDAO;


public class AlunoController {

	//Regras de negocio
	
	public void create(Aluno aluno) {
		
		System.out.println("Incluir aluno Control!!");
		
		AlunoDAO model = new AlunoDAO();
		
		model.createAluno(aluno);
		
	}
	
	
	public List<Aluno> read() {
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		
		try {
			AlunoDAO model =  new AlunoDAO();
			listaAlunos = model.read();
			
		}catch(Exception e) {
			System.out.println("Erro no controller read");
		}
		
		return listaAlunos;
	}
	
	
public int update(Aluno aluno) {
		
		System.out.println("Atualizar aluno CONTROL!!");
		
		AlunoDAO model = new AlunoDAO();
		
		int feedback = model.updateAluno(aluno);
		return feedback;
	}

public int delete(String matricula) {
	
	System.out.println("Deletar aluno CONTROL!!");
	
	AlunoDAO model = new AlunoDAO();
	
	int feedback = model.DeleteAluno(matricula);
	
	return feedback;
}
}
