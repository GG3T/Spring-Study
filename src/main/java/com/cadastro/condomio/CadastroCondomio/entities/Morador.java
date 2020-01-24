package com.cadastro.condomio.CadastroCondomio.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Data
@AllArgsConstructor
@Entity(name = "CadastroTable")
@ToString
@NoArgsConstructor
public class Morador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    @Column(name = "name")
    private String name;

    @NotBlank
    @Column(name = "CPF")
    private String cpf;

    @NotBlank
    @Column(name = "data_nascimento")
    private String dataNascimento;

    @NotBlank
    @Column(name = "data_Cadastramento")
    private String dataCadastramento;

    @NotBlank
    @Column(name = "data_atualização")
    private String dataAtualizacao;

}
