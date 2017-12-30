package sec.project.service;

import java.util.List;
import sec.project.domain.Topic;
import sec.project.domain.User;

public interface TopicService {
    void save(Topic topic);
    void delete(Topic topic);
    
    List<Topic> findAll();
    List<Topic> findByAuthor(User user);
}
