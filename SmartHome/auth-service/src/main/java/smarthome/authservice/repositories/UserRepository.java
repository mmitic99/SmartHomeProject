package smarthome.authservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import smarthome.authservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
