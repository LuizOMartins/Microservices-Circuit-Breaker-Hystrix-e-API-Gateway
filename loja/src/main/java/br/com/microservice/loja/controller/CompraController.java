package br.com.microservice.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.loja.controller.dto.CompraDTO;
import br.com.microservice.loja.model.Compra;
import br.com.microservice.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired 
	private CompraService compraService;//processar a compra	
	
	@RequestMapping("{/id}")
	public Compra getById(@PathVariable("id") Long id) {
		return compraService.getById(id);
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Compra realizaCompra(@RequestBody CompraDTO compra) {
		return compraService.realizaCompra(compra);	
	}

}
