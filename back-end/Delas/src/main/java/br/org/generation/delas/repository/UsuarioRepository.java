package br.org.generation.delas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.delas.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel,Integer>{

	public Optional<UsuarioModel> findByUser(String user);

}
