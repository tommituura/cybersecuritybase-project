package sec.project.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Account extends AbstractPersistable<Long> {
    @Id
    private Long id;
    
    private String username;
    private String password;

    @OneToMany(mappedBy="author")
    private List<Topic> topics;

    @OneToMany(mappedBy="author")
    private List<Message> messages;
    
    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }
    
    public List<Topic> getTopics() {
        return this.topics;
    }
    
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
    
    public List<Message> getMessages() {
        return this.messages;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
