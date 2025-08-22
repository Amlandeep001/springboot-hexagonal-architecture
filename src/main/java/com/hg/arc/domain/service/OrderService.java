package com.hg.arc.domain.service;

import com.hg.arc.domain.dto.FoodOrder;
import com.hg.arc.domain.port.input.PlaceOrderUsecase;
import com.hg.arc.domain.port.input.TrackOrderUsecase;
import com.hg.arc.domain.port.output.OrderRepositoryPort;

public class OrderService implements PlaceOrderUsecase, TrackOrderUsecase
{
	private final OrderRepositoryPort orderRepositoryPort;

	public OrderService(OrderRepositoryPort orderRepositoryPort)
	{
		this.orderRepositoryPort = orderRepositoryPort;
	}

	@Override
	public void placeOrder(FoodOrder order)
	{
		order.setStatus("ORDER PLACED");
		System.out.println("--CORE EXECUTED WITH INPUT PORT--");
		// Here you would typically call a repository to save the order
		orderRepositoryPort.saveOrder(order);
	}

	@Override
	public String trackOrder(String orderId)
	{
		System.out.println("--CORE EXECUTED WITH INPUT PORT--");
		return orderRepositoryPort.findById(orderId);
	}
}
