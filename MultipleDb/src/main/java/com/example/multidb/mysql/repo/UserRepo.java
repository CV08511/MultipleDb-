package com.example.multidb.mysql.repo;

import com.example.multidb.mysql.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}
