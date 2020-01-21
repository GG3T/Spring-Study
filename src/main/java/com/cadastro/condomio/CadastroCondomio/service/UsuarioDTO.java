package com.cadastro.condomio.CadastroCondomio.service;

import com.cadastro.condomio.CadastroCondomio.entities.MoradorEntities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private String name;
    private String cpf;
    private String dataNascimento;
    private String dataCadastramento;
    private String dataAtualizacao;

   public MoradorEntities transformaParaObjeto(){
       return new MoradorEntities(name, cpf, dataNascimento, dataCadastramento, dataAtualizacao);
   }

}
