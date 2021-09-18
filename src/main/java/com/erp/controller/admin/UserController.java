package com.erp.controller.admin;

import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.erp.entity.admin.AdminUser;
import com.erp.repository.admin.UserRepository;

@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path = "/find/{id}")
    public ResponseEntity<AdminUser>  findUser(@PathVariable(value = "id") Integer id) {
		
		Optional<AdminUser> user = userRepository.findById(id);
		
		return new ResponseEntity<AdminUser>(user.get(), HttpStatus.OK);

    }
	
	

	@GetMapping(path = "/all")
    public List<AdminUser> getAllUsers() {     
       return userRepository.findAll();
    }
	

	@PostMapping(path = "/add")
    public void addUser(@RequestBody AdminUser user) {

		 userRepository.save(user);
		

    }
	
	
	
	
	
}
