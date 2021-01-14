package com.docker.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.docker.demo.model.User;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	 @RequestMapping("/")
	    public List<User> getEmployees() 
	    {
	      List<User> userList = new ArrayList<User>();
	      userList.add(new User(1,"Kishor","Reddy","Kishor@gmail.com"));
	      return userList;
	    }

}
