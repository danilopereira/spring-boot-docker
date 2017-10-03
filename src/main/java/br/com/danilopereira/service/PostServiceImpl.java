package br.com.danilopereira.service;

import br.com.danilopereira.dao.PostRepository;
import br.com.danilopereira.model.Post;

import java.util.List;

/**
 * Created by danilopereira on 16/09/17.
 */
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public String save(Post post) {
        post = postRepository.save(post);

        if(post.getId() != null){
            return "Post successfully added";
        }

        return "ERROR";
    }

    @Override
    public String update(Post post) {
        if(post.getId() == null){
            return "Id could not be null";
        }

        if(postRepository.findOne(post.getId()) == null){
            return "Post not Found!";
        }

        post = postRepository.save(post);

        if(post.getId() != null){
            return "Post successfully added";
        }

        return null;
    }

    @Override
    public String delete(Long postId) {
        postRepository.delete(postId);
        return String.format("Post %s deleted!", postId);
    }

    @Override
    public List<Post> findPosts() {
        return (List<Post>) postRepository.findAll();
    }

    @Override
    public List<Post> findPostsByTag(String tag) {
        return postRepository.findByTagsContaining(tag);
    }

}
