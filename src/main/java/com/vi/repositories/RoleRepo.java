package com.vi.repositories;

import com.vi.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Vitalii on 20.06.2017.
 */
@Repository("roleRepository")
public interface RoleRepo extends JpaRepository<Role, Integer> {
    Role findByRole(String role);
}
