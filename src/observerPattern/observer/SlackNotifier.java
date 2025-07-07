package observerPattern.observer;


import observerPattern.dto.Post;

public class SlackNotifier implements PostObserver {
    @Override
    public void update(Post post) {
        System.out.println("슬랙 메시지 전송: "+ post.getTitle() +"[업무 공지] 게시글이 등록되었습니다. " );
    }
}
