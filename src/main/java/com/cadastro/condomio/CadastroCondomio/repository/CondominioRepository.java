package com.cadastro.condomio.CadastroCondomio.repository;

import com.cadastro.condomio.CadastroCondomio.entities.MoradorEntities;
import com.cadastro.condomio.CadastroCondomio.service.CondominioService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CondominioRepository extends CrudRepository<MoradorEntities, Long> {
//    Optional<MoradorEntities> findAllBy (int id, String name, String cpf, String dataNascimento, String dataCadastramento, String dataAtualizacao );

    Optional<MoradorEntities> findAllBy(CondominioService moradorEntities);
}
