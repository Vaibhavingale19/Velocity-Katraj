package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.model.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer> {

	UserDetails save(UserDetails user);

}
