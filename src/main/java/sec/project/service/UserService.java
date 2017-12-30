package sec.project.service;

import java.util.List;
import sec.project.domain.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
    
    List<User> findAll();
}
