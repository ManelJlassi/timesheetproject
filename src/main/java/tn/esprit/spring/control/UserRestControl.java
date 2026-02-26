package tn.esprit.spring.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IUserService;
import tn.esprit.spring.dto.UserDTO;

@RestController 
@RequestMapping("/user")
public class UserRestControl {

    @Autowired 
    IUserService userService; 

    @GetMapping("/retrieve-all-users")
    public List<User> retrieveAllUsers() {
        return userService.retrieveAllUsers();
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody UserDTO userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        userService.addUser(user);
    }

    @PutMapping("/modify-user") 
    public void updateUser(@RequestBody UserDTO userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        userService.updateUser(user);
    }

    @DeleteMapping("/remove-user/{user-id}") 
    public void removeUser(@PathVariable("user-id") String userId) { 
        userService.deleteUser(userId);
    } 
}