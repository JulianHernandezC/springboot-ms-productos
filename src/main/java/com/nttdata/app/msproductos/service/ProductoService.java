package com.nttdata.app.msproductos.service;

import java.util.List;

import com.nttdata.app.msproductos.repo.entity.Producto;

public interface ProductoService {
	List<Producto> findAll();
	Producto findById (Long id);
	
}
