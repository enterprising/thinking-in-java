package aa_javaLearn.threads;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

/**
 * Created by peng.tan on 17/7/29.
 */
public class QuartzTest implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Generating report - "
                + jobExecutionContext.getJobDetail().getFullName() + ", type ="
                + jobExecutionContext.getJobDetail().getJobDataMap().get("type"));
        System.out.println(new Date().toString());
    }

    public static void main(String[] args) {
        try {
            // 创建一个Scheduler
            SchedulerFactory schedFact = new StdSchedulerFactory();
            Scheduler sched = schedFact.getScheduler();
            sched.start();
            // 创建一个JobDetail，指明name，groupname，以及具体的Job类名，
            //该Job负责定义需要执行任务
            JobDetail jobDetail = new JobDetail("myJob", "myJobGroup", QuartzTest.class);
            jobDetail.getJobDataMap().put("type", "FULL");
            // 创建一个每周触发的Trigger，指明星期几几点几分执行
            Trigger trigger = TriggerUtils.makeWeeklyTrigger(3, 16, 38);
            trigger.setGroup("myTriggerGroup");
            // 从当前时间的下一秒开始执行
            trigger.setStartTime(TriggerUtils.getEvenSecondDate(new Date()));
            // 指明trigger的name
            trigger.setName("myTrigger");
            // 用scheduler将JobDetail与Trigger关联在一起，开始调度任务
            sched.scheduleJob(jobDetail, trigger);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
