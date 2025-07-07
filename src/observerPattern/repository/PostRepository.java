package observerPattern.repository;


import observerPattern.dto.Post;

public interface PostRepository {
    void save(Post post);
    void getAllPostsTitle();
}
