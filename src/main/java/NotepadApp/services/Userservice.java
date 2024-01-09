package NotepadApp.services;

import NotepadApp.Entities.User;
import NotepadApp.Repositories.UserRepository;
import NotepadApp.models.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
    @Autowired
    private UserRepository repo;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private ModelMapper modelMapper;
    public UserDto createUser(User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        User newUser = repo.save(user);
        return modelMapper.map(newUser, UserDto.class);    }
}
