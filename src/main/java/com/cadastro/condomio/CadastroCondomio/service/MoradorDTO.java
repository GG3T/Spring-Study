package com.cadastro.condomio.CadastroCondomio.service;

import com.cadastro.condomio.CadastroCondomio.entities.Morador;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoradorDTO {

    private String name;
    private String cpf;
    private String dataNascimento;
    private String dataCadastramento;
    private String dataAtualizacao;
}
