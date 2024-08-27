package com.berny.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.berny.demo.entity.Proveedor;

public interface IProveedorDAO extends CrudRepository<Proveedor, Long>{
	
}
