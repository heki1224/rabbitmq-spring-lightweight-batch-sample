package com.heki1224.spring.lightweight.batch.sample.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.heki1224.spring.lightweight.batch.sample.bean.SampleQueueBean;

@Service
public class SampleService {

	private static final Log LOG = LogFactory.getLog(SampleService.class);

	public static final String SAMPLE_QUEUE = "sampleQueue";

	@Autowired
	@Qualifier("template")
	private AmqpTemplate template;

	/**
	 * 
	 * @param queueName
	 * @return
	 */
	public SampleQueueBean receiveMessage(String queueName) {
		return (SampleQueueBean) template.receiveAndConvert(queueName);
	}

	/**
	 * 
	 * @param queueName
	 * @param message
	 */
	public void sendMessage(String queueName, SampleQueueBean message) {
		template.convertAndSend(queueName, message);
	}
}
