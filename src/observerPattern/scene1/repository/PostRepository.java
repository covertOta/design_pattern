package observerPattern.scene1.repository;


import observerPattern.scene1.dto.Post;

public interface PostRepository {
    void save(Post post);
    void getAllPostsTitle();
}
