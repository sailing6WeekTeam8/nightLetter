package project.nightletter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.nightletter.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
