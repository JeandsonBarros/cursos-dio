package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLIntegrityConstraintViolationException;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args)  {

        try {
            User user = new User();
            String username = "jeubarros";

            while (userRepository.existsUserByUsername(username)){
                username += "1";
            }

            user.setName("Jeu");
            user.setUsername(username);
            user.setPassword("12345678");

            userRepository.save(user);
            //userRepository.findAll().forEach(System.out::println);
            userRepository.buscarPorNome("Zoro").forEach(System.out::println);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
