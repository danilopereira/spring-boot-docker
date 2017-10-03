package br.com.danilopereira.service;

import br.com.danilopereira.model.Post;

import java.util.List;

/**
 * Created by danilopereira on 16/09/17.
 */
public interface PostService {


    String save(Post post);

    String update(Post post);

    String delete(Long postId);

    List<Post> findPosts();

    List<Post> findPostsByTag(String tag);
}
