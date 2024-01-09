package AuthTests;


import NotepadApp.Entities.User;
import NotepadApp.auth.JwtUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JwtTests {
    @Test
    public void dummyTest(){
        JwtUtil jwtUtil = new JwtUtil();
        User duser = new User();
        duser.setEmail("abcd@sf.com");
        duser.setUserName("abhishej");
        duser.setPassword("123");
        duser.setId(1);
        System.out.println(jwtUtil.createToken(duser));
    }
}
