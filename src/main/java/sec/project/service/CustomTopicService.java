package sec.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import sec.project.domain.Topic;
import sec.project.domain.User;
import sec.project.repository.TopicRepository;

public class CustomTopicService implements TopicService {
    @Autowired
    private TopicRepository topicRepository;

    @Override
    public void save(Topic topic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Topic topic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Topic> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Topic> findByAuthor(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
