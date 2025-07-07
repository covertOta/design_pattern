package observerPattern.subject;


import observerPattern.dto.Post;
import observerPattern.observer.PostObserver;

import java.util.ArrayList;
import java.util.List;

public class BoardManager implements PostSubject{
    private List<PostObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(PostObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(PostObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Post post) {
        for(PostObserver o : observers){
            o.update(post);
        }
    }

}
