package com.zc.auth.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zc.auth.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
   // @Query("select u from User u left join fetch u.roles r where u.username=:username")

	Optional<User> findByEmail(String email);
    
//    @Query("select zu from ZC_USER zu where zu.email_id=:emailid")
//    public Optional<User> findByUsername(@Param("emailid") String emailid);
}