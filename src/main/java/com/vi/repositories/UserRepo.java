package com.vi.repositories;

import com.vi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Vitalii on 20.06.2017.
 */
@Repository("userRepository")
public interface UserRepo extends JpaRepository<User, Long>{
    User findByEmail(String email);
}
