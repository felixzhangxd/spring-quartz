package biz.ezcom.spring.quartz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/applicationContext-*.xml")
public class QuartzJobTest {
    @Test
    public void test() {
        System.out.println("test start-------------------------");
        try {
            Thread.sleep(10000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test end---------------------------");
    }
}
