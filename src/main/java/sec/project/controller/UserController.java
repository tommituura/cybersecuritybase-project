
package sec.project.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sec.project.domain.User;
import sec.project.repository.UserRepository;

@Controller
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    @RequestMapping("/users")
    public String listUserNames(Model model) {
        List<User> users = userRepository.findAll();
        
        List<String> usernames = new ArrayList<>();
        
        for (User user : users) {
            usernames.add(user.getUserName());
        }
        return "users";
    }
}
