package dio.spring.security.repository;

import dio.spring.security.model.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleEntityRepository extends JpaRepository<RoleEntity, Integer> {
    Optional<RoleEntity> findByRole(String role);
}
