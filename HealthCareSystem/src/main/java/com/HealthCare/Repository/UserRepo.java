package com.HealthCare.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.HealthCare.entities.User;

public interface UserRepo extends JpaRepository<User,Integer> {

	@Query("select l from User l where email = :email and password =:password")
	public Optional<User> getLogin(String email,String password);
}
		