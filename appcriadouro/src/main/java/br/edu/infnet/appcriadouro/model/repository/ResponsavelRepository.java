package br.edu.infnet.appcriadouro.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcriadouro.model.domain.Responsavel;

@Repository
public interface ResponsavelRepository extends CrudRepository<Responsavel, Integer> {

	@Query("from Responsavel r where r.usuario.id = :userid")
	List<Responsavel> obterLista(Integer userid);
}
