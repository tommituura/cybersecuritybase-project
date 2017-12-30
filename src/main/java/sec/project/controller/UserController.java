
package sec.project.controller;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sec.project.domain.User;
import sec.project.service.SecurityService;
import sec.project.service.UserService;
import sec.project.validator.UserValidator;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    
    @Autowired
    private SecurityService securityService;
    
    @Autowired
    private UserValidator userValidator;
    
    // private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    
    @RequestMapping("/users")
    public String listUserNames(Model model) {
        model.addAttribute("usernames", userService.listUsernames());
        return "users";
    }
    
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }
    
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(
            // @ModelAttribute("userForm") User userForm, BindingResult bindingResult, 
            @RequestParam(name="username") String username,
            @RequestParam(name="password") String password,
            @RequestParam(name="passwordConfirm") String passwordConfirm,
            Model model
        ) {
        /*
        logger.debug("hellooooo...."+bindingResult.toString());
        userValidator.validate(userForm, bindingResult);
        
        if (bindingResult.hasErrors()) {
            return "registration";
        }
*/
        User user = new User();
        
        user.setUsername(username);
        user.setPassword(password);
        user.setPasswordConfirm(passwordConfirm);
        userService.save(user);
        
        securityService.autologin(user.getUsername(), user.getPasswordConfirm());
        
        return "redirect:/index";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null) {
            model.addAttribute("error", "Invalid username/password.");
        }
        
        if (logout != null) {
            model.addAttribute("message", "You have been logged out.");
        }
        
        return "login";
    }
}
