package com.springbootfirstapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/users")
	public List<User> getUsersApi() {
		String sql = "SELECT * FROM User_Account";
		List<User> users = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(User.class));

		return users;
		
	}
	
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}

}
