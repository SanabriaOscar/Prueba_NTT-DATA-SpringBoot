package com.example.pruebaNTTDATA.repository;

import com.example.pruebaNTTDATA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface UserRepository extends JpaRepository<User, Integer> {
}
