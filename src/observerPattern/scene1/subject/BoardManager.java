package observerPattern.scene1.subject;


import observerPattern.scene1.dto.Post;
import observerPattern.scene1.observer.PostObserver;

import java.util.ArrayList;
import java.util.List;

public class BoardManager implements PostSubject{
    private BoardManager(){};

    private static class Holder {
        private static final BoardManager instance = new BoardManager();
    }

    public static BoardManager getBoardManagerInstance(){
        return Holder.instance;
    }

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
