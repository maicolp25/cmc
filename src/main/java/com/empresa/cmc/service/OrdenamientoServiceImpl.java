package com.empresa.cmc.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrdenamientoServiceImpl implements OrdenamientoService{


	@Override
	public int[] orderNumeros(int[] numeros) {
		for (int x = 0; x < numeros.length; x++) {
	        for (int i = 0; i < numeros.length-x-1; i++) {
	            if(numeros[i] > numeros[i+1]){
	                int tmp = numeros[i+1];
	                numeros[i+1] = numeros[i];
	                numeros[i] = tmp;
	            }
	        }
	    }
		return numeros;
	}
  
}
