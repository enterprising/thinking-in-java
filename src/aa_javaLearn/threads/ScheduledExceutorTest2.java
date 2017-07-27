package aa_javaLearn.threads;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by peng.tan on 17/7/26.
 */
public class ScheduledExceutorTest2 implements Runnable {
    private String jobName = "";
    private Period between;

    public ScheduledExceutorTest2(String jobName) {
        super();
        this.jobName = jobName;
    }

    @Override
    public void run() {
        System.out.println("Date = " + new Date() + ", execute " + jobName);
    }

    public static void main(String[] args) throws Exception {
        ScheduledExceutorTest2 test = new ScheduledExceutorTest2("job1");
        LocalDateTime d = LocalDateTime.now();
        LocalDateTime target = LocalDateTime.of(d.getYear(), d.getMonth(), d.getDayOfMonth(), 11, 00, 00, 00);
        target = target.plusDays(1);
        Duration duration = Duration.between(d, target);

        //计算从当前时间到最近一次执行时间的时间间隔
        long delay = duration.toMillis();
//        delay = 3000;

        //计算执行周期为一天
        long period = 24 * 60 * 60 * 1000;
//        period = 1000;

        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        //从现在开始delay毫秒之后，每隔一星期执行一次job1
        service.scheduleAtFixedRate(test, delay, period, TimeUnit.MILLISECONDS);

    }

}
