package com.zc.auth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zc.auth.common.BaseResponse;
import com.zc.auth.common.KConstants;
import com.zc.auth.entity.Role;
import com.zc.auth.entity.User;
import com.zc.auth.entity.UserRole;
import com.zc.auth.kafka.producer.Sender;
import com.zc.auth.models.PUser;
import com.zc.auth.repository.RoleDAO;
import com.zc.auth.repository.UserDAO;
import com.zc.model.UserEvent;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping("/users")
public class RegistrationController{
	
	
	 @Value("${spring.kafka.topic.userCreated}")
	 private String USER_CREATED_TOPIC;

	 @Autowired
	 private Sender sender;
//https://o7planning.org/en/11705/create-a-login-application-with-spring-boot-spring-security-jpa
	  private static Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	  @Autowired
	  private UserDAO userDAO;
	  
	  @Autowired
	  private RoleDAO roleDAO;
	  
    @RequestMapping(method = RequestMethod.POST, value = "/register", produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<BaseResponse> registerUser(@RequestBody PUser user) {
    	
    	//https://github.com/hellokoding/registration-login-spring-hsql/tree/master/src/main/java/com/hellokoding/auth
		BaseResponse response = new BaseResponse();
		
		try {
	         logger.debug("RegistrationController-registerUser >>>>  " + user.getEmail());

        if(user.getEmail() != null) {
        	
        	
	         logger.debug("RegistrationController-registerUser1 >>>>  " + user.getEmail());

	         try {
		    		UserEvent createdUser = new UserEvent();
		    		createdUser.setId((long) 123123);
		    		createdUser.setUsername(user.getEmail());
		    		createdUser.setPassword(user.getPassword());
	      	         logger.debug("RegistrationController-Send Events >>>>  " + createdUser);
	      	         logger.debug("RegistrationController-Send Events >>>>  " + sender);

		            sender.send(USER_CREATED_TOPIC, createdUser);
	    		}catch(Exception e) {
	    			e.printStackTrace();
	    		}
	         
        		User regUsr = new User();
        		regUsr.setEmail(user.getEmail());
        		regUsr.setPassword(user.getPassword());
        		regUsr.setUsername(user.getEmail());
        		regUsr.setFirstName(user.getFirstName());
        		regUsr.setLastName(user.getLastName());
        		userDAO.register(regUsr);
        		
      	         logger.debug("RegistrationController-user.getUserType() >>>>  " + user.getUserType());

        		Role role = roleDAO.findByRoleName(user.getUserType());
        		
   	         logger.debug("RegistrationController-role >>>>  " + role);

        		UserRole userRole = new UserRole();
        		userRole.setUser(regUsr);
        		userRole.setRole(role);
        		roleDAO.save(userRole);
        		
	        	response.setStatus(KConstants.SUCCESS_STATUS);
	    		response.setCode(KConstants.CODE_SUCCESS);
	    		
	    		

	    		return new ResponseEntity<BaseResponse>(response, HttpStatus.OK);

        		} 
		}catch(Exception e) {
			e.printStackTrace();
		}
        response.setStatus(KConstants.ERROR_STATUS);
		response.setCode(KConstants.CODE_FAILUE);
		return new ResponseEntity<BaseResponse>(response, HttpStatus.BAD_REQUEST);

	}
	
	
}
