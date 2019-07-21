package me.springkafka.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyKafkaProducer {
	
	@Value("${topic-name}")
	private String topicName;
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage(String msg) {
		this.kafkaTemplate.send(topicName, msg);
		
	}

}
