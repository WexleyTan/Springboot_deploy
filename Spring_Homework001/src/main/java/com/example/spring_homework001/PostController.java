package com.example.spring_homework001;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    List<Post> postByUser = new ArrayList<>();
    int idIncrease = 1;
    LocalDateTime time = LocalDateTime.now();

    //ReadAllData
    @GetMapping("/ReadAll")
    @Operation(summary = "Read All Posts")
    public List<Post> UserInput() {
        return postByUser;
    }

    //InsertData
    @PostMapping("/insert")
    @Operation(summary = "Create new post")
    public ResponseEntity<PayLoad> insertPost(@RequestBody PostDOM newPost) {
        Post post = new Post();
        post.setId(idIncrease++);
        post.setTitle(newPost.getTitle());
        post.setContent(newPost.getContent());
        post.setAuthor(newPost.getAuthor());
        post.setCreationTime(time.toString());
        post.setTags(newPost.getTags());
        postByUser.add(post);

        PayLoad pay = new PayLoad("You Install Successfully",post,"success", time.toString());
        return ResponseEntity.status(HttpStatus.OK).body(pay);
    }

    //read by id (PathVariable)
    @GetMapping("{postId}")
    @Operation(summary = "Read post by id")
    public ResponseEntity<PayLoad> getGroupById(@PathVariable int postId) {
        for (Post post : postByUser) {
            if (post.getId() == postId) {
                PayLoad pay = new PayLoad("You Install Successfully", post, "success", time.toString());
                return ResponseEntity.ok(pay);
            }
        }
        return ResponseEntity.notFound().build();
    }

    //read by title (RequestParam)
    @GetMapping("/searchByTitle")
    @Operation(summary = "Search post by (Title)")
    public ResponseEntity<PayLoad> SearchByTitle(@RequestParam String searchQuery) {
        for (Post post : postByUser) {
            if (post.getTitle().equalsIgnoreCase(searchQuery)) {
                PayLoad pay = new PayLoad("You Install Successfully", post, "success", time.toString());
                return ResponseEntity.ok(pay);
            }
        }
        return ResponseEntity.notFound().build();
    }

    //read by title (RequestParam)
    @GetMapping("/searchByAuthor")
    @Operation(summary = "Search post by(Author)")
    public ResponseEntity<PayLoad> SearchByAuthor(@RequestParam String searchQuery) {
        for (Post post : postByUser) {
            if (post.getAuthor().equalsIgnoreCase(searchQuery)) {
                PayLoad pay = new PayLoad("You Install Successfully", post, "success", time.toString());
                return ResponseEntity.ok(pay);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/path/{updateId}")
    @Operation(summary = "Update post by id")
    public ResponseEntity<PayLoad> updateById(@PathVariable int updateId, @RequestBody PostDOM newPost) {
        for (Post post : postByUser) {
            if (post.getId() == updateId) {
                post.setTitle(newPost.getTitle());
                post.setContent(newPost.getContent());
                post.setAuthor(newPost.getAuthor());
                post.setTags(newPost.getTags());
                postByUser.add(post);
                PayLoad pay = new PayLoad("You're update Successfully", post, "success", time.toString());
                return ResponseEntity.ok(pay);
            }
        }
        return ResponseEntity.notFound().build();
    }

    //DeleteById
    @DeleteMapping("/DeleteById/{id}")
    @Operation(summary = "Delete post by id")
    public ResponseEntity<PayLoad> deleteById(@PathVariable("id") int deleteId) {
        boolean found = false;

        for(int i = 0; i<postByUser.size(); i++ ) {
            if(postByUser.get(i).getId() == deleteId) {
                found = true;
                postByUser.remove(i);
                PayLoad pay = new PayLoad("You're update Successfull",null,"success", time.toString());
                return ResponseEntity.ok(pay);
            }
        }
        PayLoad pay = new PayLoad("You're update Successfully", null,"success", time.toString());
        return ResponseEntity.ok(pay);
    }

}














