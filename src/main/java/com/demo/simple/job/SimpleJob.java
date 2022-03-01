package com.demo.simple.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SimpleJob {
	@Scheduled (fixedDelay=2000)
	public void doJob () {
		log.info ("Just do job!");
	}

	@Scheduled (cron="0 * * * * ?")
	public void doCron () {
		log.info ("Just cron job!");
	}
}
