/* 1)Crie uma classe Java de nome Aluno.java com 3 atributos: matricula, nome e curso;
   2) Crie um programa principal TesterAluno.java para ler essas informações do teclado 
   e popular o objeto;
   3) Crie um método listar() na classe Aluno que imprime o conteúdo dos atributos acima;
   4) Crie uma regra de negócio na Classe Aluno, se usuário enviar "SI" ou "si", 
   você deve considerar como sendo "Sistemas de Informação". */


public class Aluno {
			
		private String matricula;
		private String nome;
		private String curso;
		
		
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public void setCurso(String curso) {
			
			this.curso = curso;
			
			if(curso.equalsIgnoreCase("si")) {
				this.curso = "Sistemas de Informação";
			}
							
		}
		
		public void listar() {
				
			System.out.println(toString());
			
		}
		
		public String toString() {
			return "Aluno [matricula=" + matricula + ", nome=" + nome + ", curso=" + curso + "]";
		}
			
	}
