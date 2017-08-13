package aa_thread;

/**
 * Created by peng.tan on 17/8/12.
 */
public class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        t.start();
    }
}