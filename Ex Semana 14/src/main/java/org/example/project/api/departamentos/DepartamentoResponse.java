package org.example.project.api.departamentos;



public class DepartamentoResponse {
	
		public int cod;
		public String nome;
		public String sigla;
		public int receber;
		
		
		
		public DepartamentoResponse(int cod, String nome, String sigla) {
			super();
			this.cod = cod;
			this.nome = nome;
			this.sigla = sigla;
		}
		public DepartamentoResponse(Departamento departamento) {
			
			this.cod = departamento.getCodigo();
			this.nome = departamento.getNome();
			this.sigla = departamento.getSigla();
		}
		
		

}
