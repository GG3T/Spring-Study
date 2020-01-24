package com.cadastro.condomio.CadastroCondomio.service;


import com.cadastro.condomio.CadastroCondomio.entities.Morador;
import com.cadastro.condomio.CadastroCondomio.mapper.MoradorMapper;
import org.springframework.stereotype.Service;
import com.cadastro.condomio.CadastroCondomio.repository.CondominioRepository;

@Service
public class CondominioService {

    private final CondominioRepository condominioRepository;
    private final MoradorMapper moradorMapper;

    public CondominioService(CondominioRepository condominioRepository, MoradorMapper moradorMapper) {
        this.condominioRepository = condominioRepository;
        this.moradorMapper = moradorMapper;
    }

    public Morador salvar(MoradorDTO moradorDTO) {
        Morador morador = moradorMapper.moradorDTOParaMorador(moradorDTO);
        return condominioRepository.save(morador);
    }

    public Iterable<Morador> buscar() {
        return condominioRepository.findAll();
    }



}
