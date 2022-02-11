package project.nightletter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.nightletter.model.Posts;

public interface PostsRepository extends JpaRepository<Posts,Long> {
}
