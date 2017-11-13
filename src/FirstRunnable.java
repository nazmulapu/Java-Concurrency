/**
 * Created by nazmul on 11/12/2017.
 */
public class FirstRunnable {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("I am running in " + Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.start();
    }
}
