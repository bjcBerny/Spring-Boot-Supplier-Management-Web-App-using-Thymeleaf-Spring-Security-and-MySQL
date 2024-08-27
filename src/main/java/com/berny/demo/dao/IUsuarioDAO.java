package com.berny.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.berny.demo.entity.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);
	
	
}
