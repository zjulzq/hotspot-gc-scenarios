package zjulzq.github.com.scenario1;

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
