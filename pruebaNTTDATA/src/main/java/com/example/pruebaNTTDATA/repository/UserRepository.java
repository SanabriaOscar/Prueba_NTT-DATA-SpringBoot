package com.example.pruebaNTTDATA.repository;

import com.example.pruebaNTTDATA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
