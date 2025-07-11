package com.example.hospital.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hospital.model.*;
public interface UserRepository extends JpaRepository<User, Long>{

}
