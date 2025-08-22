package com.hg.arc.adapter.input.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hg.arc.domain.dto.FoodOrder;
import com.hg.arc.domain.port.input.PlaceOrderUsecase;
import com.hg.arc.domain.port.input.TrackOrderUsecase;

@RestController
@RequestMapping("/orders")
public class OrderController
{
	private final PlaceOrderUsecase placeOrderUsecase;
	private final TrackOrderUsecase trackOrderUsecase;

	public OrderController(PlaceOrderUsecase placeOrderUsecase, TrackOrderUsecase trackOrderUsecase)
	{
		this.placeOrderUsecase = placeOrderUsecase;
		this.trackOrderUsecase = trackOrderUsecase;
	}

	@PostMapping
	public ResponseEntity<String> placeOrder(@RequestBody FoodOrder order)
	{
		placeOrderUsecase.placeOrder(order);
		System.out.println("--INPUT ADAPTER EXECUTED--");
		return ResponseEntity.ok("Order placed");
	}

	@GetMapping("/track/{orderId}")
	public ResponseEntity<String> trackOrder(@PathVariable String orderId)
	{
		System.out.println("--INPUT ADAPTER EXECUTED--");
		return ResponseEntity.ok("Status: " + trackOrderUsecase.trackOrder(orderId));
	}
}
