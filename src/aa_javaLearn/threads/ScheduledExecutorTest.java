package aa_javaLearn.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by peng.tan on 17/7/26.
 * <p>
 * 任务调度
 * <p>
 * ScheduledExecutor每一个被调度的任务都会由线程池中一个线程去执行，因此任务是并发执行的，相互之间不会受到干扰。
 * 需要注意的是，只有当任务的执行时间到来时，ScheduedExecutor 才会真正启动一个线程，
 * 其余时间 ScheduledExecutor 都是在轮询任务的状态。
 */
public class ScheduledExecutorTest implements Runnable {
    private String jobName = "";

    public ScheduledExecutorTest(String jobName) {
        super();
        this.jobName = jobName;
    }

    @Override
    public void run() {
        System.out.println("execute " + jobName);
    }

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

        long initialDelay1 = 1;
        long period1 = 1;
        // 从现在开始。每间隔1秒钟执行一次job1
        service.scheduleAtFixedRate(new ScheduledExecutorTest("job1"), initialDelay1, period1, TimeUnit.SECONDS);

        long initialDelay2 = 1;
        long delay2 = 2;
        // 从现在开始。每间隔2秒钟执行一次job2
        service.scheduleAtFixedRate(new ScheduledExecutorTest("job2"), initialDelay2, delay2, TimeUnit.SECONDS);

    }

}
