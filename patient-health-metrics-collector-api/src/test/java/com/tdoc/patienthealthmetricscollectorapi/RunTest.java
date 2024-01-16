package com.tdoc.patienthealthmetricscollectorapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tdoc.patienthealthmetricscollectorapi.services.KafkaPublishService;

@SpringBootTest
class RunTest {

	@Autowired
	KafkaPublishService kafkaPublishService;
	

	@Test
	void contextLoads() {

		kafkaPublishService.publish("test-topic", "test message");
	}

}
