package com.ddada.Foodyie.Dao;

import com.ddada.Foodyie.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
