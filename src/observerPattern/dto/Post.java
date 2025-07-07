package observerPattern.dto;

public class Post {
    private String title;
    private String content;
    private String writer;

    public String getWriter() {
        return writer;
    }

    public String getTitle() {
        return title;
    }

    public Post(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
}
