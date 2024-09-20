package com.springpeople.SpringBootSchedulerDemo.schedulingtasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Tasks {
	private static final Logger LOG = LoggerFactory.getLogger(Tasks.class);
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	//@Scheduled(fixedDelay = 5000)
	@Scheduled(cron = "*/5 * * * * MON-FRI")
	public void logCurrentTime() {
		LOG.info("The time now is {}", sdf.format(new Date()));
	}
}
