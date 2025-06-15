package co.webasi.demo.repo;

import co.webasi.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository <User , Integer>{

    @Query (value = "SELECT * FROM USER WHERE id = ?1", nativeQuery = true)
    User getUserByUserId (String UserId);

}
