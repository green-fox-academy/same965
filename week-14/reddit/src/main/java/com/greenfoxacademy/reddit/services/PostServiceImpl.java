package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> listing() {
        return (List<Post>) postRepository.findAll();
    }

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public Post findPost(Long id) {
        return postRepository.findById(id).get();
    }

    private Post upvote(Post post) {
        post.setScore(post.getScore() + 1);
        addPost(post);
        return post;
    }

    private Post downvote(Post post) {
        post.setScore(post.getScore() - 1);
        addPost(post);
        return post;
    }

    public Post upvotePost(Long id) {
        return upvote(findPost(id));
    }

    public Post downvotePost(Long id) {
        return downvote(findPost(id));
    }
}
