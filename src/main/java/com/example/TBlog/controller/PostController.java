package com.example.TBlog.controller;

import com.example.TBlog.services.PostService;
import com.example.TBlog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/post/{title}/{id}")
    Post findPostByTitle(@PathVariable int id) {
        return postService.getPostByTitle(id);
    }

    @GetMapping("/post")
    public List<Post>getAllPost(){
        return postService.getAllPost();
    }

    @PostMapping("/post")
    public ResponseEntity<?> createPost(@RequestBody Post post){
        postService.createPost(post);
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }
    @PutMapping("/post/{id}")
    public void updatePostTitle(@PathVariable  int id, @RequestParam String title){
        System.out.println("Title "+title+" to be updated for id: "+ id);
        postService.updatePostByTitle(title, id);
    }

    @DeleteMapping("/post/{id}")
    public void deletePostById(@PathVariable int id){
        postService.deletePostById(id);
    }

    @GetMapping("/post/{id}")
    Post findPostByID(@PathVariable int id) {
        return postService.getPostById(id);
    }

}


