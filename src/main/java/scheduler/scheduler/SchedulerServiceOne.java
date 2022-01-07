package scheduler.scheduler;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerServiceOne {
	
	@Scheduled(initialDelay = 5000, fixedDelay = 9000) 
//	@Scheduled(initialDelayString = "5000" ,fixedDelayString = "9000")
	// 1000 milli sec = 1sec
	public void scheduledMethod() {
		System.out.println("Hello Scheduler One :" +new Date());
	}
}