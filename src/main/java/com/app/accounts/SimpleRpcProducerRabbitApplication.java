package com.app.accounts;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.app.accounts.model.AccountDescriptor;


import java.util.List;

@Component
public class SimpleRpcProducerRabbitApplication {

	private final RabbitTemplate template;

	@Autowired
	public SimpleRpcProducerRabbitApplication(RabbitTemplate template) {
		this.template = template;
	}

	public void sendMessage(List<AccountDescriptor> accountDescriptor) {
		this.template.convertAndSend("accounts", accountDescriptor.toString());
	}

	@Bean
	public Queue queue() {
		return new Queue("accounts", false);
	}
	
	
}
