package com.example.cursoBackEndJava.controller;

import com.example.cursoBackEndJava.model.Usuario;
import com.example.cursoBackEndJava.model.dto.UsuarioInputDTO;
import com.example.cursoBackEndJava.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<?> cadastrarUsuario(@RequestBody UsuarioInputDTO usuarioInputDTO){
        usuarioService.salvarUsuario(usuarioInputDTO);
        URI location = URI.create("http://localhost:8080/usuario");
        return ResponseEntity.ok(location);
    }
}
