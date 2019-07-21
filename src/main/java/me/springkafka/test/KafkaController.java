package me.springkafka.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/kafka")
public class KafkaController {
	
	@Autowired
	MyKafkaProducer kafkaProducer;
	
	@PostMapping(value="/pushMsg")
	public void pushMsg(@RequestParam String msg) {
		kafkaProducer.sendMessage(msg);
	}

}
