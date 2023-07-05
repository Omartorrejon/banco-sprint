package com.banco.bancobackend.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.banco.bancobackend.model.Cliente;
import com.banco.bancobackend.model.Transferencia;
import com.banco.bancobackend.repository.TransferenciaRepository;
public class TransferenciaService {
@Autowired
ClienteService clienteService;
@Autowired
TransferenciaRepository transferenciaRepository;

	
public ArrayList<Transferencia> leerTodo(){
	return(ArrayList<Transferencia> )this.transferenciaRepository.findAll();
}


@GetMapping()
public ArrayList<Transferencia> obtenerTransferencias(){
	return this.transferenciaService.leerTodo();
}
@GetMapping(path = "/{id}")
public Optional<Transferencia> obtenerGestor(@PathVariable("id")Integer id)
return this.transferenciaService.leerPorId(id);


}

	
	
