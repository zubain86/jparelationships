package com.example.jparelationships.dao;

import com.example.jparelationships.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity,Integer> {
}
