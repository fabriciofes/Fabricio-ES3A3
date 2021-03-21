package org.example.project.api.departamentos;

import java.util.ArrayList;
import java.util.List;

import org.example.project.api.users.User;



public class DepartamentoRepository {
	
private List<Departamento> departamentos = new ArrayList<>();
	
	public Departamento save(Departamento departamento) {
		
		departamentos.add(departamento);
		return departamento;}
	
	public List<Departamento> getAll(){
		
		return departamentos;}
	
	public Departamento getByCodigo(int cod) {
		// TODO Auto-generated method stub
		return departamentos.stream().filter(departamento -> departamento.getCodigo() == cod	)
				.findAny().orElse(null);}
	

}
