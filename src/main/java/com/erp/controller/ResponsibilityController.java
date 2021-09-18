package com.erp.controller.admin;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.erp.entity.admin.AdminResponsibility;
import com.erp.repository.admin.ResponsibilityRepository;

@RestController
@RequestMapping(path="/responsibility")
public class ResponsibilityController {
	
		
	@Autowired
	ResponsibilityRepository responsibilityRepository;
	
	@GetMapping(path = "/all")
    public List<AdminResponsibility> getAll() {  
       return responsibilityRepository.findAll();
    }
	
}
