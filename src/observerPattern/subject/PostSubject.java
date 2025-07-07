package observerPattern.subject;


import observerPattern.dto.Post;
import observerPattern.observer.PostObserver;

public interface PostSubject {
    void addObserver(PostObserver o);
    void removeObserver(PostObserver o);
    void notifyObservers(Post post);
}
