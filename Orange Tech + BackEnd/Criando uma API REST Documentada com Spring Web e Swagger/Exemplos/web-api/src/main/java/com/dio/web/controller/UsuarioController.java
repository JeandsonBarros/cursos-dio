package com.dio.web.controller;

import com.dio.web.model.Usuario;
import com.dio.web.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<Object> getTodosOsUsuarios() {
        return usuarioService.getTodosOsUsuarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getUsuario(@PathVariable int id) {
        return usuarioService.getUsuario(id);
    }

    @PostMapping
    public ResponseEntity<Object> postSalvarUsuario(@Valid @RequestBody Usuario usuario, BindingResult result) {

        if (result.hasErrors())
            return listarErros(result);

        return usuarioService.postSalvarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> putUsuario(@PathVariable int id, @Valid @RequestBody Usuario usuario, BindingResult result) {

        if (result.hasErrors())
            return listarErros(result);

        usuario.setId(id);
        return usuarioService.putUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteUsuario(@PathVariable int id) {
        return usuarioService.deleteUsuario(id);
    }

    public ResponseEntity<Object> listarErros(BindingResult result) {
        var erros = new ArrayList<>();
        for (ObjectError objectError : result.getAllErrors()) {
            String defaultMessage = objectError.getDefaultMessage();
            erros.add(defaultMessage);
        }

        return new ResponseEntity<>(erros, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
