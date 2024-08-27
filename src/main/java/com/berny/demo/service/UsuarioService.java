package com.berny.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.berny.demo.dao.IUsuarioDAO;
import com.berny.demo.entity.Rol;
import com.berny.demo.entity.Usuario;

@Service
public class UsuarioService implements UserDetailsService{
	@Autowired
	private IUsuarioDAO usuarioDAO;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDAO.findByUsername(username);
		
		if(usuario == null) {
			throw new UsernameNotFoundException("Ha ocurrido un error...");
		}
		List<GrantedAuthority> listaRoles = new ArrayList<GrantedAuthority>();
		for(Rol item: usuario.getRoles()) {
			listaRoles.add(new SimpleGrantedAuthority(item.getAuthority()));
		}
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true, listaRoles);
	}
}
