package com.nttdata.app.msproductos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.app.msproductos.repo.entity.Producto;

public interface ProductosDaoJPA extends JpaRepository<Producto, Long> {

}
