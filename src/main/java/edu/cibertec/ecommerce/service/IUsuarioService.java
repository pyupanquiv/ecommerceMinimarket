package edu.cibertec.ecommerce.service;

import java.util.Optional;

import edu.cibertec.ecommerce.model.Usuario;

public interface IUsuarioService {
	Optional<Usuario> findByid(Integer id);
	Usuario save (Usuario usuario);
	Optional<Usuario> findByEmail(String email);
}
