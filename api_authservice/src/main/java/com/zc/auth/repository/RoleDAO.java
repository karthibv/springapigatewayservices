package com.zc.auth.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zc.auth.entity.Role;
import com.zc.auth.entity.UserRole;



@Repository
@Transactional
public class RoleDAO {
	  private static Logger logger = LoggerFactory.getLogger(RoleDAO.class);

		@Autowired
	    private EntityManager entityManager;
	 
	    public List<String> getRoleNames(Long userId) {  
	        String sql = "Select ur.role.roleName from " + UserRole.class.getName() + " ur " //
	                + " where ur.user.userId = :userId ";
	        Query query = this.entityManager.createQuery(sql, String.class);
	        query.setParameter("userId", userId);
	        return query.getResultList();
	    }
	    
	  
	    public Role findByRoleName(String roleName) {
	        try {
	            String sql = "Select e from " + Role.class.getName() + " e " //
	                    + " Where e.roleName = :roleName ";
	 
	            Query query = entityManager.createQuery(sql, Role.class);
	            query.setParameter("roleName", roleName);
	 
	            return (Role) query.getSingleResult();
	        } catch (NoResultException e) {
	            return null;
	        }
	    }
	    public void save(UserRole userRole) {  
	        	logger.debug("RoleDAO->update user and role record start");
	    		entityManager.persist(userRole);
	            logger.debug("RoleDAO->update user and role record succesfully");

	    }
}
