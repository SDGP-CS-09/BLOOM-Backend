package space.bloomapp.bloomsmartfarming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.bloomapp.bloomsmartfarming.dto.UserDTO;
import space.bloomapp.bloomsmartfarming.model.User;
import space.bloomapp.bloomsmartfarming.service.UserService;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody UserDTO userDTO){
        return userService.registerUser(userDTO);
    }
}
