package biz.ezcom.spring.quartz;

public class Job {
    private int i = 0;
    
    public void work() {
        i++;
        System.out.println("work:" + i);
    }
}    
