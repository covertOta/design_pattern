package observerPattern.scene1.repository;


import observerPattern.scene1.dto.Post;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository implements PostRepository{
    private List<Post> posts = new ArrayList<>();

    @Override
    public void save(Post post) {
        posts.add(post);
    }

    @Override
    public void getAllPostsTitle() {
        for(Post post : posts){
            System.out.println(post.getTitle());
        }
    }
}
