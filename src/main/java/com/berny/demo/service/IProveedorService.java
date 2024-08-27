package com.berny.demo.service;

import java.util.List;

import com.berny.demo.entity.Proveedor;

public interface IProveedorService {
	
	public void guardar(Proveedor proveedor);
	
	public List<Proveedor> mostrarProveedores();
	
	public void eliminarProveedor(Long id);
	
}
