package com.hg.arc.adapter.input.kafka;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hg.arc.domain.dto.FoodOrder;
import com.hg.arc.domain.port.input.PlaceOrderUsecase;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class OrderKafkaConsumer
{
	private final PlaceOrderUsecase placeOrderUseCase;
	private final ObjectMapper mapper;

	// @KafkaListener(topics = "food-order-topic", groupId = "order-group")
	public void consume(String message) throws JsonProcessingException
	{
		// Assuming the message is a JSON string representing a FoodOrder
		// You would typically use a library like Jackson to convert it to a FoodOrder object
		// For simplicity, let's assume the message is directly convertible
		FoodOrder order = mapper.readValue(message, FoodOrder.class);
		placeOrderUseCase.placeOrder(order);
		System.out.println("Order placed via Kafka");
	}

}
