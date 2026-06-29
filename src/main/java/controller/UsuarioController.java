package controller;




import entity.Usuario;
import service.UsuarioService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {



    private final UsuarioService service;



    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario){

        return service.salvar(usuario);

    }



    @GetMapping("/{id}")
    public Usuario buscar(@PathVariable Long id){
        return service.buscar(id);

    }


}
