package observerPattern.observer;


import observerPattern.dto.Post;

public interface PostObserver {
    void update(Post post);
}
