package com.kk.customer;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@RefreshScope
public class CustController {

	//@Value("${demo.env}")
  
		
    @RequestMapping(value="/cust/provider", method= RequestMethod.GET)
    public String auth(){
        System.out.println("GET customer provider");

        return "PRovider is being constructed. pls wait for 2 more weeks";
    }
    
    @RequestMapping(value="/cust/patient", method= RequestMethod.GET)
    public Patient register(){
        System.out.println("GET customer patient");

        Patient patient=new Patient();
        patient.setPatientid(231);
        patient.setPatientName("esttte");
        
        return patient;
    }
}
