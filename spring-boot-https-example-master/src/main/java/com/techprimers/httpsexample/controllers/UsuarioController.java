package com.techprimers.httpsexample.controllers;

import java.io.IOException;


import javax.print.PrintException;

import com.techprimers.httpsexample.models.PrintModel;
import com.techprimers.httpsexample.models.impresion;
import com.techprimers.httpsexample.services.PrintServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/usuario")
public class UsuarioController {
   
    @Autowired
    PrintServices printService;
    @Autowired
    impresion i;
	
    
    @CrossOrigin(origins = {"https://localhost:8080","http://www.ta2.mx","https://www.ta2.mx","http://leadtosoftmexico.club"})
	@PostMapping(path = "/imprime",
    consumes = {MediaType.APPLICATION_JSON_VALUE})

	public PrintModel imprime(@RequestBody  impresion i) throws IOException, PrintException {
		return printService.obtenerUsuarios(i);
	}


//	 @CrossOrigin(origins = "http://leadtosoftmexico.club")
//		@PostMapping(path = "/imprimelead",
//	    consumes = {MediaType.APPLICATION_JSON_VALUE})
//
//		public PrintModel imprimelead(@RequestBody  impresion i) throws IOException, PrintException {
//			return printService.obtenerUsuarios(i);
//		}
//	
}