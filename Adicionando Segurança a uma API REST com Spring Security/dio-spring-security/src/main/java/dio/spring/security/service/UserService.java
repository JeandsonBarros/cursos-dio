package dio.spring.security.service;

import dio.spring.security.dto.LoginDTO;
import dio.spring.security.dto.SessaoDTO;
import dio.spring.security.dto.UserDTO;
import dio.spring.security.enums.Role;
import dio.spring.security.model.RoleEntity;
import dio.spring.security.model.UserEntity;
import dio.spring.security.repository.RoleEntityRepository;
import dio.spring.security.repository.UserEntityRepository;
import dio.spring.security.security.JWTCreator;
import dio.spring.security.security.JWTObject;
import dio.spring.security.security.JWTSecurityConfig;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private RoleEntityRepository roleEntityRepository;
    @Autowired
    private UserEntityRepository userEntityRepository;
    @Autowired
    private PasswordEncoder encoder;
    @Autowired
    JWTSecurityConfig jwtSecurityConfig;

    public ResponseEntity<Object> logar(@RequestBody LoginDTO login){

        Optional<UserEntity> user = userEntityRepository.findByEmail(login.getEmail());

        if(user.isPresent()) {

            boolean passwordOk =  encoder.matches(login.getPassword(), user.get().getPassword());

            if (!passwordOk) {
                return new ResponseEntity<>("Incorrect password for email: "+login.getEmail(), HttpStatus.UNAUTHORIZED);
            }

            //We are sending a Session object to return more information from the user
            SessaoDTO sessao = new SessaoDTO();
            sessao.setLogin(user.get().getEmail());

            JWTObject jwtObject = new JWTObject();
            jwtObject.setSubject(user.get().getEmail());
            jwtObject.setUserId(user.get().getId());
            jwtObject.setIssuedAt(new Date(System.currentTimeMillis()));
            jwtObject.setExpiration((new Date(System.currentTimeMillis() + jwtSecurityConfig.getExpiration())));

            List<String> listRoles = new ArrayList<>();
            for (RoleEntity item : user.get().getRoles()) {
                String role = item.getRole();
                listRoles.add(role);
            }

            jwtObject.setRoles(listRoles);

            sessao.setToken(JWTCreator.create(jwtSecurityConfig.getPrefix(), jwtSecurityConfig.getKey(), jwtObject));

            return new ResponseEntity<>(sessao, HttpStatus.CREATED);

        }else {
            return new ResponseEntity<>("User with email '"+login.getEmail()+"' not found", HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Object> createUser(UserDTO userDTO){
        try {

            UserEntity newUser = new UserEntity();
            BeanUtils.copyProperties(userDTO, newUser);
            newUser.setPassword(encoder.encode(userDTO.getPassword()));
            Optional<RoleEntity> roleUser = roleEntityRepository.findByRole(Role.USER.toString());
            newUser.setRoles(List.of(roleUser.get()));

            UserEntity saveUser = userEntityRepository.save(newUser);

            return new ResponseEntity<>(saveUser, HttpStatus.CREATED);

        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
