package aa_javaLearn.threads;

/**
 * Created by peng.tan on 17/7/26.
 */
public class ThreadTest233 extends Thread {
    @Override
    public void run() {
        System.out.println("线程正在运行...");
    }

    public static void main(String[] args) {
        Thread t = new ThreadTest233();
        t.start();
    }
}
