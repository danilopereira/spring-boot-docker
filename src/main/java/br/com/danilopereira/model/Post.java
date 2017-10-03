package br.com.danilopereira.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 * Created by danilopereira on 16/09/17.
 */
@Entity
@Table(name="post")
public class Post implements Serializable{

    private static final long serialVersionUID = 6487112193048605828L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinTable(name="post_tag", joinColumns = {
            @JoinColumn(name = "post_id", nullable = false, updatable = false)
    },
    inverseJoinColumns = {@JoinColumn(name="tag_id", nullable = false, updatable = false)})
    private Set<Tag> tags;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
}
