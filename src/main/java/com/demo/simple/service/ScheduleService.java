package com.demo.simple.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ScheduleService {
	@Scheduled (fixedDelay=3000)
	public void doJob () {
		log.info ("Just do service job!");
	}
}
