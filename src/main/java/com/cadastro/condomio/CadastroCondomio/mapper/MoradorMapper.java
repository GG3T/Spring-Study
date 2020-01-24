package com.cadastro.condomio.CadastroCondomio.mapper;

import com.cadastro.condomio.CadastroCondomio.entities.Morador;
import com.cadastro.condomio.CadastroCondomio.service.MoradorDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MoradorMapper {


    Morador moradorDTOParaMorador(MoradorDTO moradorDTO);


}
