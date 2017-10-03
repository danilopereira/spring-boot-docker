package br.com.danilopereira.controller;

import br.com.danilopereira.model.Post;
import br.com.danilopereira.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by danilopereira on 16/09/17.
 */
@RestController
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/api/post")
    public String createPost(@RequestBody Post post){
        return postService.save(post);
    }

    @PutMapping("/api/post")
    public String updatePost(@RequestBody Post post){
        return postService.update(post);
    }

    @DeleteMapping("/api/post/{id}")
    public String deletePost(@PathVariable("id") Long postId){
        return postService.delete(postId);
    }

    @GetMapping("/api/post")
    public List<Post> findAll(){
        return postService.findPosts();
    }


}
