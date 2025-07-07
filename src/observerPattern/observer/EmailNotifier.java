package observerPattern.observer;


import observerPattern.dto.Post;

public class EmailNotifier implements PostObserver {
    private final String adminEmail = "admin@A.com";

    @Override
    public void update(Post post) {
        System.out.println("관리자 " + adminEmail + " 에 이메일 발송 완료 : " + post.getTitle());
    }
}
