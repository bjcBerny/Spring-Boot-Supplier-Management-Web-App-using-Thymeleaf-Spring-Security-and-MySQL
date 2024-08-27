package com.berny.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berny.demo.dao.IProveedorDAO;
import com.berny.demo.entity.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService{
	
	@Autowired
	private IProveedorDAO proveedorDAO;
	
	@Override
	public List<Proveedor> mostrarProveedores() {	
		return (List<Proveedor>)proveedorDAO.findAll();
	}

	@Override
	public void guardar(Proveedor proveedor) {		
		proveedorDAO.save(proveedor);
	}

	@Override
	public void eliminarProveedor(Long id) {		
		proveedorDAO.deleteById(id); 
	}
	
}
