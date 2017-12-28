package sec.project.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.security.crypto.password.PasswordEncoder;

@Entity
public class User extends AbstractPersistable<Long> {
    @Id
    private Long id;
    
    private String username;
    private String password;

    @Autowired
    private PasswordEncoder encoder;
    
    @OneToMany(mappedBy="author")
    private List<Topic> topics;

    @OneToMany(mappedBy="author")
    private List<Message> messages;
    
    public User(String username, String plaintextPassword) {
        topics = new ArrayList<>();
        messages = new ArrayList<>();
        
        this.username = username;
        this.password = this.encoder(plaintextPassword);
    }

    public String getUserName() {
        return this.username;
    }
    
}
