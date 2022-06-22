package com.example.TBlog.Services;

import com.example.TBlog.Repository.PostRepository;
import com.example.TBlog.Repository.UsersRepository;
import com.example.TBlog.model.Post;
import com.example.TBlog.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;


    public  List<Post> getAllPost(){
        return postRepository.findAllPost();
    }

    public void createPost(Post post){
        postRepository.saveNewPost(post);
    }

    public  Post getPostById(int id){
        return postRepository.getOneById(id);
    }

}





