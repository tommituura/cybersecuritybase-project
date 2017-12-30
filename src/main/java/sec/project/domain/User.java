package sec.project.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "users")
public class User extends AbstractPersistable<Long> {
    @Id
    private Long id;

    private String username;
    private String password;
    @Transient
    private String passwordConfirm;
    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))

    private Set<Role> roles;

    @OneToMany(mappedBy="author")
    private List<Topic> topics;

    @OneToMany(mappedBy="author")
    private List<Message> messages;
    
    @Override
    public Long getId() {
        return id;
    }
    
    @Override
    public void setId(Long id) {
        this.id = id;
    }
    
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
    
    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
    
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
