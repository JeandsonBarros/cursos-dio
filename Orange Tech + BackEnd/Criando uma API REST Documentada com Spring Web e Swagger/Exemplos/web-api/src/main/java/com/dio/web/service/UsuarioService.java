package com.dio.web.service;

import com.dio.web.model.Usuario;
import com.dio.web.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public ResponseEntity<Object> getTodosOsUsuarios() {
        try {
            return new ResponseEntity<>(usuarioRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Object> postSalvarUsuario(Usuario usuario) {
        try {
            usuarioRepository.save(usuario);
            return new ResponseEntity<>(usuario, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Object> getUsuario(int id) {
        try {

            var usuario = usuarioRepository.findById(id);
            if (!usuario.isPresent()) {

                Map<String, String> mensagem = new HashMap<>() {{
                    put("mensagem", "Usuário com id " + id + " não encontrado");
                }};

                return new ResponseEntity<>(mensagem, HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(usuario.get(), HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Object> deleteUsuario(int id) {
        try {
            Map<String, String> mensagem = new HashMap<>();
            var usuario = usuarioRepository.findById(id);

            if (!usuario.isPresent()) {
                mensagem.put("mensagem", "Usuário com id " + id + " não encontrado");
                return new ResponseEntity<>(mensagem, HttpStatus.NOT_FOUND);
            }

            usuarioRepository.deleteById(id);

            mensagem.put("mensagem", "Usuário com id " + id + " deletado");
            return new ResponseEntity<>(mensagem, HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Object> putUsuario(Usuario usuario) {
        try {

            Map<String, String> mensagem = new HashMap<>();

            if (!usuarioRepository.findById(usuario.getId()).isPresent()) {
                mensagem.put("mensagem", "Usuário com id " + usuario.getId() + " não encontrado");
                return new ResponseEntity<>(mensagem, HttpStatus.NOT_FOUND);
            }

            usuarioRepository.save(usuario);
            return new ResponseEntity<>(usuario, HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
