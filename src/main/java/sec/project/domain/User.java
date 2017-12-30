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
    
    private Long id;

    private String username;
    private String password;
    private String passwordConfirm;
    private Set<Role> roles;

    private List<Topic> topics;

    private List<Message> messages;
    
    @Id
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
    
    @OneToMany(mappedBy="author")
    public List<Topic> getTopics() {
        return this.topics;
    }
    
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
    
    @OneToMany(mappedBy="author")
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
    
    @Transient
    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
    
    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
