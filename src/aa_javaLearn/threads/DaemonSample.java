package aa_javaLearn.threads;

/**
 * Created by yanxuxin
 * 守护线程
 */
public class DaemonSample {

    public static void main(String[] args) throws InterruptedException {
        DaemonThread t = new DaemonThread();
        t.setDaemon(true);  //将这行注释一下，对比效果。你就知道什么是守护线程了。
        t.start();
        Thread.sleep(2000);
        System.out.println("main thread exit.");
    }

}

class DaemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i=" + i);
        }
    }
}
