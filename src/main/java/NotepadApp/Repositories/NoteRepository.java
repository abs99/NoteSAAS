package NotepadApp.Repositories;

import NotepadApp.Entities.Note;
import NotepadApp.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note,Integer> {

        public List<Note> findByUser(User user);
}
