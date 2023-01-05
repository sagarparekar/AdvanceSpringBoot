package com.example.demo.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer>
{
	@Query(value="select u from User u where u.username = :username and u.password= :password")
	public User validateUser(@Param("username") String username,@Param("password") String password);

}
