package sec.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sec.project.domain.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
