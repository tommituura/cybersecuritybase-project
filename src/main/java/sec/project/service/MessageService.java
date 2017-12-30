package sec.project.service;

import java.util.List;
import sec.project.domain.Message;

public interface MessageService {
    void save(Message message);
    void delete(Message message);
    
    List<Message> findAll();
    List<Message> findByAuthor();
}
