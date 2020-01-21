package com.cadastro.condomio.CadastroCondomio.controller;

import com.cadastro.condomio.CadastroCondomio.entities.MoradorEntities;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cadastro.condomio.CadastroCondomio.service.CondominioService;
import com.cadastro.condomio.CadastroCondomio.service.UsuarioDTO;

import javax.swing.text.html.Option;
import java.util.Optional;


@RestController
@RequestMapping("/comdominio")
@Data
public class MoradorController {

    private final CondominioService condominioService;

    @Autowired
    public MoradorController(CondominioService condominioService) {
        this.condominioService = condominioService;
    }

    @PostMapping("/morador")
    public ResponseEntity<MoradorEntities> salvar(@RequestBody UsuarioDTO dto) {
        MoradorEntities moradorEntities = condominioService.salvar(dto.transformaParaObjeto());
        return new ResponseEntity<>(moradorEntities, HttpStatus.CREATED);
    }

    @GetMapping("/moradores")
    public ResponseEntity<MoradorEntities> BuscarDados() {
        Optional<MoradorEntities> BuscarRegistro = condominioService.buscar(condominioService);
        return new ResponseEntity<>(BuscarRegistro.get(), HttpStatus.OK);
    }
}




