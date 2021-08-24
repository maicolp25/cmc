package com.empresa.cmc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.cmc.service.OrdenamientoService;


@RestController
@RequestMapping("pruebatecnica")
public class CMCPruebaController {
	
   @Autowired
   OrdenamientoService ordenamientoService;
   
   @GetMapping
   public HttpEntity<int[]> get(){
	   int numeros[] = {2, 4, 5, 1, 6, 3, 9, 7, 8, 0};
	   return new ResponseEntity<>(ordenamientoService.orderNumeros(numeros), HttpStatus.OK);
   }

}
