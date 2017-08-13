package aa_thread;

/**
 * Created by peng.tan on 17/8/12.
 */
public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
        Thread t = new Thread(r);
        t.start();
    }
}
