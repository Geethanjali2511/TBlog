package com.example.TBlog.Controller;

import com.example.TBlog.Repository.PostRepository;
import com.example.TBlog.Services.PostService;
import com.example.TBlog.model.Post;
import com.example.TBlog.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/post")
    public List<Post>getAllPost(){
        return postService.getAllPost();
    }



    @PostMapping("/post")
    public ResponseEntity<?> createPost(@RequestBody Post post){
        postService.createPost(post);
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }

    @GetMapping("/post/{id}")
    Post findPostByID(@PathVariable int id) {
        return postService.getPostById(id);
    }
}


