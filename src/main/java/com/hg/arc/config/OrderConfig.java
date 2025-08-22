package com.hg.arc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hg.arc.domain.port.output.OrderRepositoryPort;
import com.hg.arc.domain.service.OrderService;

@Configuration
public class OrderConfig
{
	@Bean
	OrderService orderService(OrderRepositoryPort repository)
	{
		return new OrderService(repository);
	}
}
