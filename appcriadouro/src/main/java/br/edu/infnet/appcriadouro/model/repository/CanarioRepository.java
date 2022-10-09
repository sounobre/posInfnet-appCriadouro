package br.edu.infnet.appcriadouro.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcriadouro.model.domain.Canario;

@Repository
public interface CanarioRepository extends CrudRepository<Canario, Integer> {

	@Query("from Canario c where c.usuario.id = :idUsuario")
	Collection<Canario> findAll(Integer idUsuario);
}