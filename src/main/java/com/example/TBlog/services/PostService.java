package com.example.TBlog.services;

import com.example.TBlog.repository.PostRepository;
import com.example.TBlog.model.Post;
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

    public  Post getPostById(int id) {
        return postRepository.getOneById(id);
    }

    public  Post getPostByTitle(int id) {
        return postRepository.getPostByTitle(id);
    }

    public void updatePostByTitle(String title, int id) {
        postRepository.updatePostByTitle(title,id);
    }

    public void deletePostById(int id) {
        postRepository.deletePostById(id);
    }
}





