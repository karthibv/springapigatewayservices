insert into ZC_USER(USER_ID, EMAIL_ID,USER_TYPE,XXXXCARE_ID, FULL_NAME, FIRST_NAME, LAST_NAME, PASSWORD) values(1, 'cxxxx@gmail.com','PROVIDER','ZC12345','XXXX 32','xxxx','xxxx','$2a$10$bnC26zz//2cavYoSCrlHdecWF8tkGfPodlHcYwlACBBwJvcEf0p2G');
insert into ZC_USER(USER_ID, EMAIL_ID,USER_TYPE,XXXXCARE_ID,FULL_NAME,FIRST_NAME, LAST_NAME, PASSWORD) values(2, 'th11@gmail.com','PROVIDER','ZC12346','xxx xx','xxxx2','xx232','$2a$10$bnC26zz//2cavYoSCrlHdecWF8tkGfPodlHcYwlACBBwJvcEf0p2G');


INSERT INTO ZC_ROLE(ROLE_ID,ROLE_NAME,ROLE_CATEGORY,SUB_ROLE_CATEGORY,ROLE_DESCRIPTION,REC_STATUS)VALUES (1,'ADMIN','A','A','Administrator','A');
INSERT INTO ZC_ROLE(ROLE_ID,ROLE_NAME,ROLE_CATEGORY,SUB_ROLE_CATEGORY,ROLE_DESCRIPTION,REC_STATUS)VALUES (2,'PROVIDER','A','A','Provider','A');


insert into ZC_USER_ROLE(ZC_UR_ID, USER_ID, ROLE_ID) values(1, 1, 1);
insert into ZC_USER_ROLE(ZC_UR_ID, USER_ID, ROLE_ID) values(2, 2, 1);


