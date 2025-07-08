package observerPattern.scene1.observer;


import observerPattern.scene1.dto.Post;
import observerPattern.scene1.subject.BoardManager;

public class SlackObserver implements PostObserver {
    public SlackObserver() {
        BoardManager.getBoardManagerInstance().addObserver(this);
    }

    @Override
    public void update(Post post) {
        System.out.println("슬랙 메시지 전송: "+ post.getTitle() +"[업무 공지] 게시글이 등록되었습니다. " );
    }
}
