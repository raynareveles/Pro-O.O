/*Rayná Araújo Reveles - 0050013521*/

package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bo.Aluno;
import jdbc.ConnectionFactory;

public class AlunoDAO {

	public void createAluno(Aluno aluno)  {
		
		
		Connection banco = ConnectionFactory.getConnection();
		
		PreparedStatement stmt = null;
		
		
		try {
			String sql = "insert into aluno(matricula,nome,cidade) values (?,?,?)";
			
			stmt = banco.prepareStatement(sql);
			stmt.setString(1,aluno.getMatricula());
			stmt.setString(2,aluno.getNome());
			stmt.setString(3,aluno.getCidade());
			
			stmt.executeUpdate();
			
			System.out.println("Aluno inserido com sucesso!!");
		 	
		} catch(SQLException e) {
			System.out.println("Erro ao tentar incluir aluno");
		} finally {
			ConnectionFactory.closeConnection(banco,stmt);
			
		}
	}

	public List<Aluno> read() {
		
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		Connection banco = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet resultado = null;
		
		
		
		String sql = "Select matricula,nome,cidade from aluno";
		
		try {
			stmt = banco.prepareStatement(sql);
			resultado = stmt.executeQuery();
			
			while(resultado.next()) {
				Aluno aluno = new Aluno();
				aluno.setMatricula(resultado.getString("matricula"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setCidade(resultado.getString("cidade"));
				
				listaAlunos.add(aluno);
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Erro ao tentar ler aluno...");
		}
		finally {
			ConnectionFactory.closeConnection(banco,stmt);
		}
		
		
		
		return listaAlunos;
	}
	
	
	
public int updateAluno(Aluno aluno)  {
		
		//update sql no banco
		
		Connection banco = ConnectionFactory.getConnection();
		
		PreparedStatement stmt = null;
		
		
		try {
			String sql = "update aluno SET nome = ? ,cidade = ? Where matricula = ?";
			
			stmt = banco.prepareStatement(sql);
			
			stmt.setString(1,aluno.getNome());
			stmt.setString(2,aluno.getCidade());
			stmt.setString(3,aluno.getMatricula());
			int NdeDeletados = stmt.executeUpdate();
			
			
		 	return NdeDeletados;
		} catch(SQLException e) {
			
			return 0;
		} finally {
			ConnectionFactory.closeConnection(banco,stmt);
			
		}
	}

public int DeleteAluno(String matricula)  {
	
	
	Connection banco = ConnectionFactory.getConnection();
	
	PreparedStatement stmt = null;
	
	
	try {
		String sql = "DELETE FROM aluno WHERE matricula = ?";
		
		stmt = banco.prepareStatement(sql);
		
		
		stmt.setString(1,matricula);
		
		int NdeDeletados = stmt.executeUpdate();
		
		
		
		return NdeDeletados;
				
	 	
	} catch(SQLException e) {
		System.out.println("Erro ao tentar Deletar aluno");
		
		return 0;
				
	} finally {
		ConnectionFactory.closeConnection(banco,stmt);
		
	}
}
	
	
	
}
