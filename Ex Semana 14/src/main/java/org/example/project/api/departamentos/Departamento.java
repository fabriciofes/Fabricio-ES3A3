package org.example.project.api.departamentos;

public class Departamento {
	private int cod;
	private  static int  cc = 0;
	private String nome;
	private String sigla;
	
	
	public Departamento( String nome, String sigla) {
		this.cod = cc++;
		this.nome = nome;
		this.sigla = sigla;
	}
	
	


	public Departamento(int codigo, String nome, String sigla) {
	
		this.cod = codigo;
		this.nome = nome;
		this.sigla = sigla;
	}


	public int getCodigo() {
		return cod;
	}


	public String getNome() {
		return nome;
	}


	public String getSigla() {
		return sigla;
	}
	
	
	public static int getCountId() {
		return cc;
	}
	
	

}
