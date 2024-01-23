package NotepadApp.services;

import NotepadApp.Entities.Note;
import NotepadApp.Entities.User;
import NotepadApp.Repositories.NoteRepository;
import NotepadApp.Repositories.UserRepository;
import NotepadApp.models.NoteDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ModelMapper modelMapper;
    public NoteDto createNote(NoteDto noteDto, Integer userId){

        User user = userRepo.findById(userId).orElse(null);
        Note note = modelMapper.map(noteDto,Note.class);
        note.setUser(user);
        return modelMapper.map(noteRepo.save(note),NoteDto.class);

    }

    public List<NoteDto> getNotesForUser(Integer userId){
        User user= userRepo.findById(userId).orElse(null);
        List<Note> notes = noteRepo.findByUser(user);
        List<NoteDto> noteDtos = new ArrayList<>();
        noteDtos = notes.stream().map((note)->modelMapper.map(note,NoteDto.class)).collect(Collectors.toList());
        return noteDtos;
    }

    public NoteDto getNote(Integer noteId){
        return modelMapper.map(noteRepo.findById(noteId).orElse(null),NoteDto.class);
    }
}
