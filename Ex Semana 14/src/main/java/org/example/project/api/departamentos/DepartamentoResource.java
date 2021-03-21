package org.example.project.api.departamentos;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.example.project.api.users.User;
import org.example.project.api.users.UserResponse;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;




@Path("departamento")
public class DepartamentoResource {
	
		
		
		private  static DepartamentoRepository departamentoRepository = new DepartamentoRepository();
		 @POST
		 @Produces(MediaType.APPLICATION_JSON)
		 @Consumes(MediaType.APPLICATION_JSON)
		public Response create(DepartamentoRequest request) {
			 
			Departamento departamento = new Departamento(request.nome, request.sigla);
			 
			departamentoRepository.save(departamento);
			 
			 return Response.status(Response.Status.CREATED).entity(new DepartamentoResponse(departamento.getCodigo(), departamento.getNome(), departamento.getSigla()))
			 .build();
	
	

}
		 @GET
		 @Path("{codigo}")
		 @Produces(MediaType.APPLICATION_JSON)
		 public Response show(@PathParam("codigo") int cod) {
			 Departamento departamento = departamentoRepository.getByCodigo(cod);
			 
			 if(departamento == null) {
				 return Response.status(Status.NOT_FOUND).build();
			 }
			 
			return Response.status(Status.OK).entity(new DepartamentoResponse(departamento)).build();
			 
			 
		 }
	}

