package sec.project.service;

import sec.project.domain.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
