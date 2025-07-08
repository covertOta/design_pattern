package observerPattern.scene1.observer;

public class ObserverRegist {
    public static void registAll(){
        PostObserver appNotifier = new AppObserver();
        PostObserver emailNotifier = new EmailObserver();
        PostObserver slackNotifier = new SlackObserver();
    }
}
