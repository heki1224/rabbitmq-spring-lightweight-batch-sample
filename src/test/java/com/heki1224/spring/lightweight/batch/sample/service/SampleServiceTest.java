package com.heki1224.spring.lightweight.batch.sample.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.heki1224.spring.lightweight.batch.sample.bean.SampleQueueBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/spring/app-config.xml" })
public class SampleServiceTest {

	@Autowired
	private SampleService sampleService;

	@Test
	public void test() {
		SampleQueueBean message = new SampleQueueBean();
		message.setName("test user");
		message.setAge(30);
		message.setBirthday(new Date());
		message.setAvailable(true);
		sampleService.sendMessage(SampleService.SAMPLE_QUEUE, message);
	}
}
