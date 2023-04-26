package org.example.udemy.composicao.post;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public  class Post {
    private LocalDateTime moment;
    private String title;
    private String content;
    private int like;
    private List<Comment> comment = new ArrayList<>();

    public Post() {

    }

    public Post(String title, String content, int like) {
        this.moment = LocalDateTime.now();
        this.title = title;
        this.content = content;
        this.like = like;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getLike() {
        return like;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void addComment(Comment comment) {
        this.comment.add(comment);
    }

    @Override
    public String toString() {
        return
                "Title='" + title + '\'' +
                        ", Moment=" + moment +
                        ", Content='" + content + '\'' +
                        ", Comments=" + comment +
                        ", Like=" + like +
                        '}';
    }
}
