package com.example.cursoBackEndJava.service;

import com.example.cursoBackEndJava.model.Usuario;
import com.example.cursoBackEndJava.model.dto.UsuarioInputDTO;
import com.example.cursoBackEndJava.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private ModelMapper modelMapper;

    public void salvarUsuario(UsuarioInputDTO usuarioInputDTO) {
        Usuario usuario = modelMapper.map(usuarioInputDTO, Usuario.class);
        usuarioRepository.save(usuario);
    }
}
