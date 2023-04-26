package org.example.udemy.composicao;

import org.example.udemy.composicao.post.Comment;
import org.example.udemy.composicao.post.Post;

public class AppPost {
    public static void main(String[] args) {


        Post post = new Post("A volta dos q n foram", "Uma aventura qualquer", 13);

        Comment commentOne = new Comment("Vamos la");
        Comment commentTwo = new Comment("Ai ai ai ne vida");

        post.addComment(commentOne);
        post.addComment(commentTwo);

        System.out.println(post);


    }
}

