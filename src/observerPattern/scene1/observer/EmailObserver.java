package observerPattern.scene1.observer;


import observerPattern.scene1.dto.Post;
import observerPattern.scene1.subject.BoardManager;

public class EmailObserver implements PostObserver {
    private final String adminEmail = "admin@A.com";

    public EmailObserver() {
        BoardManager.getBoardManagerInstance().addObserver(this);
    }

    @Override
    public void update(Post post) {
        System.out.println("관리자 " + adminEmail + " 에 이메일 발송 완료 : " + post.getTitle());
    }
}
