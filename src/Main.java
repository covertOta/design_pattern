import observerPattern.dto.Post;
import observerPattern.observer.AppNotifier;
import observerPattern.observer.EmailNotifier;
import observerPattern.observer.PostObserver;
import observerPattern.observer.SlackNotifier;
import observerPattern.repository.InMemoryRepository;
import observerPattern.repository.PostRepository;
import observerPattern.subject.BoardManager;
import observerPattern.subject.PostSubject;

public class Main {
    public static void main(String[] args) {
        PostSubject subject = new BoardManager();

        PostObserver appNotifier = new AppNotifier();
        PostObserver emailNotifier = new EmailNotifier();
        PostObserver slackNotifier = new SlackNotifier();

        subject.addObserver(appNotifier);
        subject.addObserver(emailNotifier);
        subject.addObserver(slackNotifier);

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