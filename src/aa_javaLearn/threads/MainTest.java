package aa_javaLearn.threads;

/**
 * Created by peng.tan on 17/7/26.
 *
 * [通过Thread实例的start()，一个Thread的实例只能产生一个线程]
 * 把下面的10个线程称为同一实例(Runnable实例)的多个线程。
 */

class MyThreadDemo extends Thread {
    int x = 0;

    @Override
    public void run() {
        System.out.println(++x);
    }
}

class RunableDemo implements Runnable {
    private int x = 0;

    @Override
    public void run() {
        System.out.println(++x);
    }
}


public class MainTest {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread t = new MyThreadDemo();
            t.start();
        }
        Thread.sleep(10000); // 让上面的线程进行完成
        System.out.println("\n");
        RunableDemo r = new RunableDemo();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(r);
            t.start();
        }
    }

}
