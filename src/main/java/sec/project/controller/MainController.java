package sec.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sec.project.service.SecurityService;
import sec.project.service.UserService;

@Controller
public class MainController {
    @Autowired
    private UserService userService;
    
    @Autowired
    private SecurityService securityService;

    @RequestMapping(value = { "/", "/index" } )
    public String index(Model model) {
        model.addAttribute("usernames", userService.listUsernames());
        return "index";
    }
}
