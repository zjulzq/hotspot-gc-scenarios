package zjulzq.github.com.scenarios.oom;

/**
 * Creating too many threads.
 * -Xmx12m -Xms12m -XX:+PrintGCDetails
 */
public class Scenario3 {

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }

}
