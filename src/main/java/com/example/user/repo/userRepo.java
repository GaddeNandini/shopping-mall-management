package com.example.user.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user.userdetails;

public interface userRepo  extends JpaRepository<userdetails, Integer>{

}
