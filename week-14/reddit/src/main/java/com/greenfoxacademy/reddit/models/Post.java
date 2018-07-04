package com.greenfoxacademy.reddit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;
    private Date timestamp;
    private int score;

    public Post() {
        this.timestamp = new Date();
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
