package service;

package com.raizes.service;


import entity.Usuario;
import repository.UsuarioRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class UsuarioService {


    private final UsuarioRepository repository;



    public Usuario salvar(Usuario usuario){

        return repository.save(usuario);

    }



    public Usuario buscar(Long id){

        return repository.findById(id)
                .orElseThrow(
                        ()-> new RuntimeException("Usuário não encontrado")
                );

    }


}
