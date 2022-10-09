package br.edu.infnet.appcriadouro.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcriadouro.model.domain.Coleiro;

@Repository
public interface ColeiroRepository extends CrudRepository<Coleiro, Integer> {

	@Query("from Coleiro c where c.usuario.id = :idUsuario")
	Collection<Coleiro> findAll(Integer idUsuario);
}