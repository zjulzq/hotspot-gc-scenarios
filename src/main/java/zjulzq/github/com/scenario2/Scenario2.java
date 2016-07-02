package zjulzq.github.com.scenario2;

/**
 * Creating big objects. 
 * -Xmx12m -Xms12m -XX:+PrintGCDetails
 */
public class Scenario2 {
    private static final int ONE_M = 1024 * 1024;

    public static void main(String[] args) {
        int[] array = new int[ONE_M];
        array = new int[ONE_M];
        array = new int[ONE_M];
        System.out.println(array.length);
    }

}
