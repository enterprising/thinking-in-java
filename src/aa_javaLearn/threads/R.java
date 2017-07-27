package aa_javaLearn.threads;

/**
 * Created by peng.tan on 17/7/26.
 */
public class R implements Runnable {
    private int x = 0;
    @Override
    public void run() {
        for (int i =0;i<100;i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(x++);
        }
    }
}
