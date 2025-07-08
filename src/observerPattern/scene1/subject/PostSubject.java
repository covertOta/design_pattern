package observerPattern.scene1.subject;


import observerPattern.scene1.dto.Post;
import observerPattern.scene1.observer.PostObserver;

public interface PostSubject {
    void addObserver(PostObserver o);
    void removeObserver(PostObserver o);
    void notifyObservers(Post post);
}
