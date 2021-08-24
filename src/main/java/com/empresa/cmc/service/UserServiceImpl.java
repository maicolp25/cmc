package com.empresa.cmc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.cmc.dto.Usuario;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private ApiUsers apiUsers;

	@Override
	public ArrayList<Usuario> traerTresUsuarios() {
		ArrayList<Usuario> ultimosTresusuarios= new ArrayList<Usuario>();
		 ArrayList<Usuario> usuarios=apiUsers.sendApiUsers();
		 int  i=0;
		
		 for (Usuario usuario: usuarios) {
			 if(i<=2){
				 ultimosTresusuarios.add(usuario);
				 i++;
			 }
		 }
		
		return ultimosTresusuarios;
	}

}
