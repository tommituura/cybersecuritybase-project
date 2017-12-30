package sec.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import sec.project.domain.Message;
import sec.project.repository.MessageRepository;

public class CustomMessageService implements MessageService {
    @Autowired
    private MessageRepository messageRepository;

    @Override
    public void save(Message message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Message message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Message> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Message> findByAuthor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
