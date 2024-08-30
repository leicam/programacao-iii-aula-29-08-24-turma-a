package br.edu.umfg.prog.tres.api.controllers;

import br.edu.umfg.prog.tres.api.entities.Cliente;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.ArrayList;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private ArrayList<Cliente> lista = new ArrayList<Cliente>();

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> post(
            @RequestBody Cliente cliente){
        this.lista.add(cliente);
        return ResponseEntity.ok(cliente);
    }
}
