package com.example.invoicegenerator.persistence;

import com.example.invoicegenerator.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
