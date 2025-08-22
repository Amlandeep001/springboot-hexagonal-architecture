package com.hg.arc.adapter.output.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hg.arc.adapter.output.entity.OrderEntity;

public interface SpringDataOrderRepository extends JpaRepository<OrderEntity, String>
{
}
