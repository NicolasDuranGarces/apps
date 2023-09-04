package com.nicolas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicolas.models.User;

// Podemos usar tambien  CrudRepository solo que tiene menos funciones que JPARepostory

public interface IUserRepository extends JpaRepository<User, Long> {

}
