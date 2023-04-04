package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

	@Autowired
	PostsDao postdao; 
	
	
	@RequestMapping("/")
	public String home()
	{
		return "Welcome";
	}
	
	
	@GetMapping("/allPosts")
	@CrossOrigin
	public List<Post> getAllPosts()
	{
		return postdao.findAll();
	}
	
	@PostMapping("/post")
	@CrossOrigin
	public Post addPost(@RequestBody Post post)
	{
		return postdao.save(post);
	}
}
