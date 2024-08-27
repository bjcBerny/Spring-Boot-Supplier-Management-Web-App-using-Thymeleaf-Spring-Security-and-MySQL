package com.berny.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.berny.demo.entity.Proveedor;
import com.berny.demo.service.IProveedorService;

@Controller
@RequestMapping("/proveedor")
public class ProveedorController {
	
	@Autowired
	private IProveedorService proveedorService;
	
	/*
	@RequestMapping("/")
	public String inicio(Model model) {
		model.addAttribute("listaProveedores", objProveedor.mostrarProveedores());
		return "proveedor/index";
	}	*/
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Proveedor proveedor = new Proveedor();
		model.addAttribute("proveedor", proveedor);
		model.addAttribute("listaProveedores", proveedorService.mostrarProveedores());
		return "proveedor/index";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String guardar(Proveedor proveedor, BindingResult result) {
		proveedorService.guardar(proveedor);
		return "redirect:/proveedor/";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		proveedorService.eliminarProveedor(id);
		return "redirect:/proveedor/";
	}
}
