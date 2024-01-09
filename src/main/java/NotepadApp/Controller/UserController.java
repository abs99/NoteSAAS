package NotepadApp.Controller;

import NotepadApp.Entities.User;
import NotepadApp.models.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import NotepadApp.services.Userservice;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private Userservice service;

    @GetMapping("/checkauth")
    public String checkauth(){
        return "auth successs";
    }
    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody User userDetails){

        UserDto newUser = service.createUser(userDetails);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
}
