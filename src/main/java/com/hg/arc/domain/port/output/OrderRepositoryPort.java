package com.hg.arc.domain.port.output;

import com.hg.arc.domain.dto.FoodOrder;

public interface OrderRepositoryPort
{
	void saveOrder(FoodOrder order);

	String findById(String orderId);
}
