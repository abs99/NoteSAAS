package NotepadApp.Repositories;

import NotepadApp.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
        @Query("SELECT u FROM User u where u.email = :email")
        public User findUserByEmail(@Param("email") String emailId);
}
