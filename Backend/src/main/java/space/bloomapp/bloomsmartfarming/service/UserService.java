package space.bloomapp.bloomsmartfarming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import space.bloomapp.bloomsmartfarming.dto.UserDTO;
import space.bloomapp.bloomsmartfarming.model.User;
import space.bloomapp.bloomsmartfarming.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public User registerUser(UserDTO userDTO){
        if(userRepository.existsByEmail(userDTO.getEmail())){
            throw new IllegalArgumentException("Email already exists");
        }
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        user.setLocation(userDTO.getLocation());

        return userRepository.save(user);
    }
}
