package br.edu.infnet.appcriadouro.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcriadouro.model.domain.Criadouro;

@Repository
public interface CriadouroRepository extends CrudRepository<Criadouro, Integer> {

	@Query("from Criadouro c where c.usuario.id = :idUsuario")
	Collection<Criadouro> findAll(Integer idUsuario);
}
