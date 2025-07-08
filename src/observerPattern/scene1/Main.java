package observerPattern.scene1;

import observerPattern.scene1.dto.Post;
import observerPattern.scene1.observer.ObserverRegist;
import observerPattern.scene1.repository.InMemoryRepository;
import observerPattern.scene1.repository.PostRepository;
import observerPattern.scene1.subject.BoardManager;
import observerPattern.scene1.subject.PostSubject;

public class Main {
    public static void main(String[] args) {
        PostSubject subject = BoardManager.getBoardManagerInstance();
        ObserverRegist.registAll();

        PostRepository postRepository = new InMemoryRepository();

        Post post1 = new Post("zerg", "strong", "jd");
        postRepository.save(post1);
        subject.notifyObservers(post1);
        Post post2 = new Post("protoss", "tremendous", "bisu");
        postRepository.save(post2);
        subject.notifyObservers(post2);

        postRepository.getAllPostsTitle();
    }
}