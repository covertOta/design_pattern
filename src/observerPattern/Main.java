package observerPattern;

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

    /*✅ 요구사항: 게시판 시스템 알림 기능
📌 기본 시나리오
회사 내부 게시판 시스템이 있습니다.
게시글이 등록될 때 다음과 같은 후속 작업이 동시에 일어나야 합니다:

📌 요구사항
관리자 이메일 발송
게시글이 등록되면 관리자에게 이메일이 전송되어야 함.

Slack 채널에 메시지 전송
등록된 게시글의 제목을 포함한 메시지가 슬랙 채널에 자동 전송됨.

게시글 작성자에게 알림 발송
작성자에게 "게시글이 정상 등록되었습니다"라는 앱 내부 알림이 전송됨.*/
}