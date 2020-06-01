package com.satyaApp.crudapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.satyaApp.crudapi.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
