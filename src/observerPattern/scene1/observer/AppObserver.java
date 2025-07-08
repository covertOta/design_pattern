package observerPattern.scene1.observer;


import observerPattern.scene1.dto.Post;
import observerPattern.scene1.subject.BoardManager;

public class AppObserver implements PostObserver {
    public AppObserver() {
        BoardManager.getBoardManagerInstance().addObserver(this);
    }

    @Override
    public void update(Post post) {
        System.out.println("작성자 " + post.getWriter() + " 에게 앱 푸시 알림 전송");
    }
}
