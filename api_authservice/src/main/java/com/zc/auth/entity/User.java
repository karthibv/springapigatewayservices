package com.zc.auth.entity;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="ZC_USER")
public class User {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "USER_ID")
		private Long userId;
		
		@Column(name = "EMAIL_ID", nullable = false, unique = true)
		@Email(message = "Please provide a valid e-mail")
		@NotEmpty(message = "Please provide an e-mail")
		private String email;
	   
		@Column(name="FULL_NAME")
	    private String username;
	    
	    @Column(name = "FIRST_NAME")
		@NotEmpty(message = "Please provide your first name")
		private String firstName;
		
		@Column(name = "LAST_NAME")
		@NotEmpty(message = "Please provide your last name")
		private String lastName;
	    
	    @Column(name="PASSWORD")
	    private String password;
	   
	    @Column(name="USER_TYPE" , nullable = true )
	    private String userType;
	    
	    @Column(name="XXXXCARE_ID" , nullable = true )
	    private String xxxxCareID;
	   
	    @Column(name="PRIMARY_ID_TYPE", nullable = true )
	    private String primaryIDType;
	   
	    @Column(name="PRIMARY_ID_NUMBER" , nullable = true )
	    private String primaryIDNumber;

	    @Column(name="SECONDARY_ID_TYPE" , nullable = true )
	    private String secondaryIDType;
	   
	    @Column(name="SECONDARY_ID_NUMBER" , nullable = true )
	    private String secondaryIDNumber;

	    @Column(name="TEL_OFF" , nullable = true )
	    private String telOffice;
	   
	    @Column(name="TEL_HOME" , nullable = true  )
	    private String telHome;
	   
	    @Column(name="TEL_MOB" , nullable = true )
	    private String telMobile;
	   
	    @Column(name="LANG_CODE", nullable = true )
	    private String langCode;
	    
	    @Column(name="COUNTRY_CODE" , nullable = true )
	    private String countryCode;
	    
	    @Column(name="LAST_LOGIN_DATE" , nullable = true )
	    private String lastLognDateTime;
	    
	    @Column(name="CURRENT_LOGON_FLAG" , nullable = true )
	    private String currentLoginFlag;
	   
	    @Column(name="REC_STATUS", nullable = true )
	    private String recStatus;
	   
//	    @ManyToMany
//	    @JoinTable(name = "ZC_USER_ROLE", joinColumns = @JoinColumn(name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
//	    private Set<Role> roles;
//	    
	    
	    public User() { }
	    
	    public User(Long userId, String email, String username, String firstName, String lastName,String password) {
	        this.userId = userId;
	        this.email = email;
	        this.firstName= firstName;
	        this.lastName = lastName;
	        this.username = username;
	        this.password = password;
	      //  this.roles = roles;
	    }

	    public Long getUserId() {
	        return userId;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }
	    
//	    public Set<Role> getRoles() {
//	        return roles;
//	    }
	    
	    public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public void setPassword(String password) {
			this.password = password;
		}

//		public void setRoles(Set<Role> roles) {
//			this.roles = roles;
//		}
//		

	    public String getUserType() {
			return userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getXxxxCareID() {
			return xxxxCareID;
		}

		public void setXxxxCareID(String xxxxCareID) {
			this.xxxxCareID = xxxxCareID;
		}

		public String getPrimaryIDType() {
			return primaryIDType;
		}

		public void setPrimaryIDType(String primaryIDType) {
			this.primaryIDType = primaryIDType;
		}

		public String getPrimaryIDNumber() {
			return primaryIDNumber;
		}

		public void setPrimaryIDNumber(String primaryIDNumber) {
			this.primaryIDNumber = primaryIDNumber;
		}

		public String getSecondaryIDType() {
			return secondaryIDType;
		}

		public void setSecondaryIDType(String secondaryIDType) {
			this.secondaryIDType = secondaryIDType;
		}

		public String getSecondaryIDNumber() {
			return secondaryIDNumber;
		}

		public void setSecondaryIDNumber(String secondaryIDNumber) {
			this.secondaryIDNumber = secondaryIDNumber;
		}

		public String getTelOffice() {
			return telOffice;
		}

		public void setTelOffice(String telOffice) {
			this.telOffice = telOffice;
		}

		public String getTelHome() {
			return telHome;
		}

		public void setTelHome(String telHome) {
			this.telHome = telHome;
		}

		public String getTelMobile() {
			return telMobile;
		}

		public void setTelMobile(String telMobile) {
			this.telMobile = telMobile;
		}

		public String getLangCode() {
			return langCode;
		}

		public void setLangCode(String langCode) {
			this.langCode = langCode;
		}

		public String getCountryCode() {
			return countryCode;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public String getLastLognDateTime() {
			return lastLognDateTime;
		}

		public void setLastLognDateTime(String lastLognDateTime) {
			this.lastLognDateTime = lastLognDateTime;
		}

		public String getCurrentLoginFlag() {
			return currentLoginFlag;
		}

		public void setCurrentLoginFlag(String currentLoginFlag) {
			this.currentLoginFlag = currentLoginFlag;
		}


	    public String getRecStatus() {
			return recStatus;
		}

		public void setRecStatus(String recStatus) {
			this.recStatus = recStatus;
		}

}
