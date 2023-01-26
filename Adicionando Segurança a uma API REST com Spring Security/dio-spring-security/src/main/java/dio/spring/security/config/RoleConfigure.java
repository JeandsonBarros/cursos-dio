package dio.spring.security.config;

import dio.spring.security.enums.Role;
import dio.spring.security.model.RoleEntity;
import dio.spring.security.model.UserEntity;
import dio.spring.security.repository.RoleEntityRepository;
import dio.spring.security.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class RoleConfigure implements CommandLineRunner {

    @Autowired
    private RoleEntityRepository roleEntityRepository;

    @Autowired
    private UserEntityRepository userEntityRepository;

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public void run(String... args) {

        try {

            List<String> rolesString = new ArrayList<>() {{
                add(Role.ADMIN.toString());
                add(Role.USER.toString());
                add(Role.MASTER.toString());
            }};

            rolesString.forEach(roleString -> {
                Optional<RoleEntity> roleOptional = roleEntityRepository.findByRole(roleString);
                if (!roleOptional.isPresent()) {
                    RoleEntity roleEntity = new RoleEntity();
                    roleEntity.setRole(roleString);
                    roleEntityRepository.save(roleEntity);
                }
            });

            System.out.println(roleEntityRepository.findAll());

            Optional<UserEntity> userEntity = userEntityRepository.findByEmail("geoo677@gmail.com");
            if(!userEntity.isPresent()){
                UserEntity newUser = new UserEntity();
                newUser.setName("Jeandson Barros");
                newUser.setEmail("geoo677@gmail.com");
                newUser.setPassword(encoder.encode("zorosola"));
                Optional<RoleEntity> roleMaster = roleEntityRepository.findByRole(Role.MASTER.toString());
                newUser.setRoles(List.of(roleMaster.get()));
                userEntityRepository.save(newUser);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
