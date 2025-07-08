package observerPattern.scene1.observer;


import observerPattern.scene1.dto.Post;

public interface PostObserver {
    void update(Post post);
}
