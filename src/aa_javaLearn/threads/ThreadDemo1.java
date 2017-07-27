package aa_javaLearn.threads;

/**
 * Created by peng.tan on 17/7/26.
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        ThreadTest233 t = new ThreadTest233();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}

class ThreadTest implements Runnable {

    private int tickets = 5;

    public void run() {
        while (true) {
//            synchronized (this) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + " is saling ticket ");
                tickets--;
            }
        }

    }
}