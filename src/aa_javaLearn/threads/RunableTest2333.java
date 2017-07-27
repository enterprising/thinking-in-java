package aa_javaLearn.threads;

/**
 * Created by peng.tan on 17/7/26.
 */
public class RunableTest2333 implements Runnable{
    @Override
    public void run() {
        System.out.println("线程正在运行...");
    }

    public static void main(String[] args) {
        RunableTest2333 r = new RunableTest2333();
        Thread t = new Thread(r);
        t.start();
    }
}
