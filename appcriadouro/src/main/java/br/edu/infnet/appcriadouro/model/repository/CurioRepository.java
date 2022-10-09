package br.edu.infnet.appcriadouro.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcriadouro.model.domain.Curio;

@Repository
public interface CurioRepository extends CrudRepository<Curio, Integer> {

	@Query("from Curio c where c.usuario.id = :idUsuario")
	Collection<Curio> findAll(Integer idUsuario);
}