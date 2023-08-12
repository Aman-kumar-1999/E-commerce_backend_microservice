package com.eqipped.productService.service;

import com.eqipped.productService.entities.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;


//@Service
public interface UserService {
	
	// update User Details
	public Map<String, Object> updateUser(MultipartFile images, String id);


}
