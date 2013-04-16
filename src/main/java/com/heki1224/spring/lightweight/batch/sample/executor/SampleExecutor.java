package com.heki1224.spring.lightweight.batch.sample.executor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.heki1224.spring.lightweight.batch.sample.bean.SampleQueueBean;
import com.heki1224.spring.lightweight.batch.sample.service.SampleService;

@Component
public class SampleExecutor {

	private static final Log LOG = LogFactory.getLog(SampleExecutor.class);

	private static boolean isAlive = true;

	@Autowired
	private SampleService sampleService;

	/**
	 * 
	 */
	public synchronized void stop() {
		isAlive = false;
	}

	/**
	 * 
	 */
	public void execute() {
		while (isAlive) {
			try {
				SampleQueueBean bean = sampleService.receiveMessage(SampleService.SAMPLE_QUEUE);
				if (bean != null) {
					LOG.info(bean.toString());
				}
			} catch (Exception e) {
				LOG.error(e);
			}
		}
	}
}
