package aa_javaLearn.threads;

/**
 * Created by peng.tan on 17/7/26.
 */

class MyThread extends Thread {
    public int x = 0;

    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            System.out.println(x++);
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join();  // 不加这句话又是另外一种效果了
//        System.out.println(101);
        Thread.sleep(3000);
        t.start();
    }
}

