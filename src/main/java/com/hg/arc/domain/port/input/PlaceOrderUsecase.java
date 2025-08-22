package com.hg.arc.domain.port.input;

import com.hg.arc.domain.dto.FoodOrder;

public interface PlaceOrderUsecase
{
	void placeOrder(FoodOrder order);
}
