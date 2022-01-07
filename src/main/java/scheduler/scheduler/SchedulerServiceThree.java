package scheduler.scheduler;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component

public class SchedulerServiceThree {
    @Scheduled(cron = "15 * * * * *")
	public void scheduledMethod() {
		System.out.println("Hello cron Scheduler Three :" +new Date());
	}
    
}
