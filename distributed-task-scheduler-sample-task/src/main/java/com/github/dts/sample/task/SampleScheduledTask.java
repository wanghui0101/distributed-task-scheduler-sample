package com.github.dts.sample.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("sampleScheduledTask")
public class SampleScheduledTask {

	private static final Logger logger = LoggerFactory.getLogger(SampleScheduledTask.class);
	
	public void doTask() {
		logger.info("doTask at {}", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
	
	public void doTask2() {
		logger.info("doTask2 at {}", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
