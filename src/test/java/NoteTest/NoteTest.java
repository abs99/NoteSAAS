package NoteTest;
import NotepadApp.Entities.User;
import NotepadApp.Repositories.NoteRepository;
import NotepadApp.models.NoteDto;
import NotepadApp.services.NoteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoteTest {

    @Autowired
    private NoteService noteService;
//    @Test
//    public void createNoteTest(){
//        NoteDto noteDto = new NoteDto();
//        noteDto.setNoteContent("abcd");
//        User user = new User();
//        user.setId(1);
//        noteDto.setUser(user);
//        noteService.createNote(noteDto);
//    }

}
