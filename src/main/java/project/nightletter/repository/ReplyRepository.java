package project.nightletter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.nightletter.model.Reply;

public interface ReplyRepository extends JpaRepository<Reply,Long> {
}
