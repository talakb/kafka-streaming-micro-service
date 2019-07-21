package me.springkafka.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
	
	@Value("${topic-name}")
	private String topicName = "";
	
	@KafkaListener(topics= "SpringBootTest", groupId = "test-consumer-group")
	public String consumeKafkaMessages(String msg) {
		return msg;
	}

}
