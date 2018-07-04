package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

import java.util.List;

public interface PostService {
    public List<Post> listing();
    public void addPost(Post post);
    public Post upvotePost(Long id);
    public Post downvotePost(Long id);
    public Post findPost(Long id);
}
