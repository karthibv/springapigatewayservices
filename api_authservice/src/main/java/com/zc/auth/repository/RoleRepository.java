package com.zc.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zc.auth.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Integer>{
	
//    @Query("select zr from ZC_ROLE zr where zr.rolename=:rolename")
	//Role findByRole(@Param("rolename") String rolename);

}
