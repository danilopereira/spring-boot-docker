package br.com.danilopereira.configuration;

import br.com.danilopereira.dao.PostRepository;
import br.com.danilopereira.service.PostService;
import br.com.danilopereira.service.PostServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by danilopereira on 16/09/17.
 */
@Configuration
public class ApplicationConfig {
    @Bean
    public PostService postService(PostRepository postRepository){
        return new PostServiceImpl(postRepository);
    }
}
