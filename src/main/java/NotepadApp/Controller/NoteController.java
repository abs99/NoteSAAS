package NotepadApp.Controller;

import NotepadApp.models.NoteDto;
import NotepadApp.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    NoteService service;
    @PostMapping("/{userId}")
    public ResponseEntity<NoteDto> createNote(@PathVariable Integer userId,
                                              @RequestBody NoteDto noteDto){

        NoteDto newNote  = service.createNote(noteDto,userId);
        return new ResponseEntity<>(newNote, HttpStatus.CREATED);
    }
//    @GetMapping
//    @RequestMapping("/user/{userId}")
//    public ResponseEntity<List<NoteDto>> getNotesForUser(@PathVariable Integer userId){
//
//    }
    @GetMapping
    @RequestMapping("/{noteId}")
    public ResponseEntity<NoteDto> getNote(@PathVariable Integer noteId){

        NoteDto noteDto = service.getNote(noteId);
        return new ResponseEntity<>(noteDto, HttpStatus.OK);
    }

}
