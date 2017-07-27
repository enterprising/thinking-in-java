package aa_javaLearn;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by peng.tan on 17/7/26.
 *
 * 任务调度。不停地执行。
 */
public class TimerTest2 {
    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("当前时间：" + new Date());
            }
        }, new Date(), 3000);

    }
}
