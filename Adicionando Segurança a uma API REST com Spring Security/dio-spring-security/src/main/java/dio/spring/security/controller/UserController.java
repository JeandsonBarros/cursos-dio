package dio.spring.security.controller;

import dio.spring.security.dto.LoginDTO;
import dio.spring.security.dto.SessaoDTO;
import dio.spring.security.dto.UserDTO;
import dio.spring.security.model.UserEntity;
import dio.spring.security.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<Object> postSalvarUsuario(@Valid @RequestBody UserDTO userDTO, BindingResult result) {

        if (result.hasErrors())
            return listErrors(result);

        return userService.createUser(userDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<Object> logar(@RequestBody LoginDTO login){
       return userService.logar(login);
    }

    @GetMapping("/users")
    /* @PreAuthorize("hasRole('ADMIN', 'USER', 'MASTER')")*/
    public String users() {
        return "Authorized user";
    }

    @GetMapping("/admins")
    /* @PreAuthorize("hasRole('ADMIN', 'MASTER')")*/
    public String admins() {
        return "Authorized admin";
    }

    @GetMapping("/masters")
    /* @PreAuthorize("hasRole('MASTER')")*/
    public String masters() {
        return "Authorized master";
    }

    public ResponseEntity<Object> listErrors(BindingResult result) {

        var erros = new ArrayList<>();

        for (ObjectError objectError : result.getAllErrors()) {
            String defaultMessage = objectError.getDefaultMessage();
            erros.add(defaultMessage);
        }

        return new ResponseEntity<>(erros, HttpStatus.BAD_REQUEST);
    }

}
