package NotepadApp.Entities;

import jakarta.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;
    @Column(name = "data")
    String noteContent;

    public String getNoteContent() {
        return noteContent;
    }
    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }
    public Integer getId() {

        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
