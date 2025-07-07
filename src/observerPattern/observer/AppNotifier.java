package observerPattern.observer;


import observerPattern.dto.Post;

public class AppNotifier implements PostObserver {
    @Override
    public void update(Post post) {
        System.out.println("작성자 " + post.getWriter() + " 에게 앱 푸시 알림 전송");
    }
}
