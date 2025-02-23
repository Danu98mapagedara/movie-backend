package com.example.demo.repo;

import com.example.demo.modal.ContactDetails;
import com.example.demo.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
