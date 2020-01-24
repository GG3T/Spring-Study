package com.cadastro.condomio.CadastroCondomio.controller;

import com.cadastro.condomio.CadastroCondomio.entities.Morador;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cadastro.condomio.CadastroCondomio.service.CondominioService;
import com.cadastro.condomio.CadastroCondomio.service.MoradorDTO;


@RestController
@RequestMapping("/condominio")
@Data
public class MoradorController {

    @Autowired
    private final CondominioService condominioService;

    @Autowired
    public MoradorController(CondominioService condominioService) {
        this.condominioService = condominioService;
    }

    @PostMapping("/morador")
    public ResponseEntity<Morador> salvar(@RequestBody MoradorDTO dto) {
        Morador morador = condominioService.salvar(dto);
        return new ResponseEntity<>(morador, HttpStatus.CREATED);
    }

    @GetMapping("/moradores")
    public ResponseEntity<Iterable<Morador>> buscar() {
        Iterable<Morador> morador = condominioService.buscar();
        return new ResponseEntity<>(morador, HttpStatus.OK);
    }



}




