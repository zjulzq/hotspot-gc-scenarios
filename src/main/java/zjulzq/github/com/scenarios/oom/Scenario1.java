package zjulzq.github.com.scenarios.oom;

/**
 * 
 * Creating objects in a loop.
 */
public class Scenario1 {

    public static void main(String[] args) {
        Object object = null;
        while (!Thread.interrupted()) {
            object = new Object();
        }

        System.out.println(object.hashCode());
    }

}
