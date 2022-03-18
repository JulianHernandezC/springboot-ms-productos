package com.nttdata.app.msproductos.restcontroller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.app.msproductos.repo.entity.Producto;
import com.nttdata.app.msproductos.service.ProductoService;

@RestController
public class ProductoController {
	
	@Value("${server.port}")
	private Integer port;

	@Autowired
	ProductoService service;
	
	@GetMapping ("/listar")
	public List<Producto> listar() {
		return service.findAll().stream().map( p -> { p.setPort(port); return p; }).
				collect(Collectors.toList()); 
	}
	
	@GetMapping ("/listar/{id}")
	public Producto detalle (@PathVariable Long id) {
		Producto p = service.findById(id);
		p.setPort(port);
		return p;
	}
	
}
