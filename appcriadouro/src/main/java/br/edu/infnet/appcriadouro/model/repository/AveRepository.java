package br.edu.infnet.appcriadouro.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcriadouro.model.domain.Ave;

@Repository
public interface AveRepository extends CrudRepository<Ave, Integer> {

	@Query("from Ave a where a.usuario.id = :idUsuario")
	Collection<Ave> findAll(Integer idUsuario);
}
