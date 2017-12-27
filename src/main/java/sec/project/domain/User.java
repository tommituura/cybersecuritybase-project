package sec.project.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class User extends AbstractPersistable<Long> {
    @Id
    private Long id;
    
    @OneToMany(mappedBy="author")
    private List<Topic> topics;

    @OneToMany(mappedBy="author")
    private List<Message> messages;
    
    
}
