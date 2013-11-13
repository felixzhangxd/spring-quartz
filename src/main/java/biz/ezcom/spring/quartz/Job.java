package biz.ezcom.spring.quartz;

public class Job {
    
    public void executeInternal() throws InterruptedException {
        Thread.sleep(3000L);
        System.out.println("job: " + System.currentTimeMillis()/1000);
    }
}    
