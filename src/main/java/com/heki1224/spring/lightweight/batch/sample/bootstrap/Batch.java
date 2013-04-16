package com.heki1224.spring.lightweight.batch.sample.bootstrap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.heki1224.spring.lightweight.batch.sample.executor.SampleExecutor;

public class Batch {

	private static final Log LOG = LogFactory.getLog(Batch.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final ClassPathXmlApplicationContext context =
			new ClassPathXmlApplicationContext("spring/app-config.xml");
		final SampleExecutor executor = context.getBean(SampleExecutor.class);

		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				try {
					executor.stop();
					LOG.info("executor stop.");
					sleep(1000);
					context.close();
				} catch (Exception e) {
					LOG.error(e);
				}
			}
		});

		LOG.info("executor start.");
		executor.execute();
	}

}
