package br.org.generation.delas.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import br.org.generation.delas.model.PostagemModel;

public interface PostagemRepository extends JpaRepository<PostagemModel, Integer>{
	
	
}
