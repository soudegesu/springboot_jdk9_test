package soudegesu.springboot.jdknine.main.demo.controller;

import soudegesu.springboot.jdknine.main.demo.model.User;
import soudegesu.springboot.jdknine.main.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.getUsers();
    }

}
