package br.com.danilopereira.dao;

import br.com.danilopereira.model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by danilopereira on 16/09/17.
 */
public interface PostRepository extends CrudRepository<Post, Long> {

    List<Post> findByTagsContaining(String tag);

}
