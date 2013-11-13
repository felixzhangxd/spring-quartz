package biz.ezcom.spring.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class QuartzJob extends QuartzJobBean {
    private int timeout;

    public QuartzJob() {
        System.out.println("QuartzJob init()");
    }
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    protected void executeInternal(JobExecutionContext ctx) throws JobExecutionException {
        // 同步执行
        System.out.println("\tQuartzJob: " + System.currentTimeMillis() / 1000 + "  " + timeout);
    }
}
