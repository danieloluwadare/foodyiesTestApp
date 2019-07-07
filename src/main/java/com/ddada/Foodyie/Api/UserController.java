package com.ddada.Foodyie.Api;

import com.ddada.Foodyie.Entity.User;
import com.ddada.Foodyie.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {

    private UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUsers")
    public List<User> GetEmployees() {
        List<User> user = userService.getAll();
        System.out.println(user);
        return user;
    }

    @GetMapping("/getUser/{userId}")
    public User GetEmployee(@PathVariable int userId) {
        User user = userService.findById(userId);
        if (user != null) {
            return user;
        }
        throw new RuntimeException("User of id" + userId + " is not found");
    }

    @PostMapping("/createUser")
    public User CreateEmployee(@RequestBody User user) {
        if (user.getId() > 0) {
            user.setId(0);
        }
        userService.save(user);
        return user;
    }


}
