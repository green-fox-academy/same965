package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

import java.util.List;

public interface PostService {
    public List<Post> listing();
    public void addPost(Post post);
}
