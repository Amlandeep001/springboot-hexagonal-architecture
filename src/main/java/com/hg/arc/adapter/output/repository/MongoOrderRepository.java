package com.hg.arc.adapter.output.repository;

import com.hg.arc.domain.dto.FoodOrder;
import com.hg.arc.domain.port.output.OrderRepositoryPort;

public class MongoOrderRepository implements OrderRepositoryPort
{

	// inject mongo repository

	@Override
	public void saveOrder(FoodOrder order)
	{
	}

	@Override
	public String findById(String orderId)
	{
		return "";
	}
}
