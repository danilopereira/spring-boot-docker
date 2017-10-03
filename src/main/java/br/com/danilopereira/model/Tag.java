package br.com.danilopereira.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by danilopereira on 27/09/17.
 */
@Entity
@Table(name = "tag")
public class Tag implements Serializable{
    private static final long serialVersionUID = -5578446391047418767L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="tag")
    private String tag;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "tags")
    private Set<Post> posts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
}
