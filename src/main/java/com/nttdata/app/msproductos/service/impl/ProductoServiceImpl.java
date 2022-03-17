package com.nttdata.app.msproductos.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.app.msproductos.repo.ProductosDaoJPA;
import com.nttdata.app.msproductos.repo.entity.Producto;
import com.nttdata.app.msproductos.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	ProductosDaoJPA dao;
	
	@Override
	@Transactional (readOnly=true)
	public List<Producto> findAll() {
		return dao.findAll();
	}

	@Override
	@Transactional (readOnly=true)
	public Producto findById(Long id) {
		return dao.findById(id).orElse(null);
	}

}
