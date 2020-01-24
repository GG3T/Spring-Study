package com.cadastro.condomio.CadastroCondomio.repository;

import com.cadastro.condomio.CadastroCondomio.entities.Morador;
import com.cadastro.condomio.CadastroCondomio.service.CondominioService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CondominioRepository extends CrudRepository<Morador, Long> {

}
