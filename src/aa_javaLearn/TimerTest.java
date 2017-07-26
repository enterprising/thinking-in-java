package aa_javaLearn;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by peng.tan on 17/7/26.
 * <p>
 * 测试java的定时任务
 */
public class TimerTest {
    Timer timer;

    public TimerTest(int time) {
        timer = new Timer();
        timer.schedule(new TimerTaskTest(), time);
    }

    public static void main(String[] args) {
        System.out.println("Timer begin....");
        new TimerTest(5000);
    }
}

class TimerTaskTest extends TimerTask {
    public void run() {
        System.out.println("Time's up!!!!");
    }

}
