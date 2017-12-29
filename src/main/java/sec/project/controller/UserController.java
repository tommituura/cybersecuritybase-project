
package sec.project.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sec.project.domain.Account;
import sec.project.repository.AccountRepository;

@Controller
public class UserController {
    
    @Autowired
    private AccountRepository userRepository;
    
    @RequestMapping("/users")
    public String listUserNames(Model model) {
        List<Account> users = userRepository.findAll();
        
        List<String> usernames = new ArrayList<>();

        for (Account user : users) {
            usernames.add(user.getUserName());
        }

        model.addAttribute("usernames", usernames);
        return "users";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String loadRegisterForm() {
        return "register";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegisterFormValues(@RequestParam String username, @RequestParam String password, @RequestParam String email) {
        
        return "redirect:/users";
    }
}
