package com.example.demo.Controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("auth/user")
public class AuthenticationCcontroller 
{
	private Map<String, String> mapObj = new HashMap<String, String>();
	
	private UserService userServ;
	
	@Autowired
	public AuthenticationCcontroller(UserService userServ)
	{
		super();
		this.userServ = userServ;
	}
	
	
	@PostMapping("/registerUser")
	public ResponseEntity<?>  addUser(@RequestBody User user)
	{
		if(userServ.addUser(user)!=null)
		{
			return new ResponseEntity<User>(user, HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("User data not inserted", HttpStatus.CONFLICT);
	}
	

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user)
	{
		try
		{
			System.out.println(user.getUsername()+"   "+user.getPassword());
			String jwtToken = generateToken(user.getUsername(), user.getPassword());
			mapObj.put("message", "User Successfully logged in");
			mapObj.put("token", jwtToken);
			
		}
		catch(Exception e)
		{
			mapObj.put("message", "User not logged in");
			mapObj.put("token", null);
			return new ResponseEntity<String>("User credentials are invalid", HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<>(mapObj, HttpStatus.ACCEPTED);
	}
	
	
	public String generateToken(String username, String password) throws Exception, ServletException
	{
		System.out.println("Hello");
		
		String jwtToken = "";
		if(username ==null || password == null)
		{
			throw  new ServletException("Please enter valid username and password");
		}
		
		boolean flag = userServ.validateUser(username, password);
		
		if(!flag)
		{
			throw  new ServletException("Invalid username and password");
		}
		else
		{
			jwtToken = Jwts.builder().setSubject(username).setIssuedAt(new Date())
						.setExpiration(new Date(System.currentTimeMillis()+ 3000000))
						.signWith(SignatureAlgorithm.HS256, "secret key").compact();
		}
		return jwtToken;
	}
}











