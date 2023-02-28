package ada.escuelaing.postgres.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ada.escuelaing.postgres.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}