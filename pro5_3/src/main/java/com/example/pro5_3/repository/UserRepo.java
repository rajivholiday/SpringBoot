package com.example.pro5_3.repository;

import com.example.pro5_3.entity.Userss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Userss, Integer> {

}
