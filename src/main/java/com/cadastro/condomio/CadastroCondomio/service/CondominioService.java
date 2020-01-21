package com.cadastro.condomio.CadastroCondomio.service;


import com.cadastro.condomio.CadastroCondomio.entities.MoradorEntities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cadastro.condomio.CadastroCondomio.repository.CondominioRepository;

import java.util.Optional;

@Service
public class CondominioService {

    private final CondominioRepository condominioRepository;

    @Autowired
    public CondominioService(CondominioRepository condominioRepository) {
        this.condominioRepository = condominioRepository;
    }

    public MoradorEntities salvar(MoradorEntities moradorEntities) {
        return condominioRepository.save(moradorEntities);
    }

    public Optional<MoradorEntities> buscar(CondominioService moradorEntities) {
        return condominioRepository.findAllBy(moradorEntities);
    }
}
