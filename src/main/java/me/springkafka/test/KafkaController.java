package me.springkafka.test;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/kafka")
public class KafkaController {
	
	@Autowired
	KafkaProducerService kafkaProducer;
	
	@Autowired
	KafkaConsumerService kafkaConsumer;
	
	@PostMapping(value="/pushMsg")
	public void pushMsg(@RequestParam String msg) {
		kafkaProducer.sendMessage(msg);
	}
	
	@GetMapping(value="/consumeMsg")
	public String consumeMsg() {
		return kafkaConsumer.consumeKafkaMessages("");
	}

}
