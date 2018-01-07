package com.hito.repository;

import java.util.List;

import com.hito.model.Order;

public interface OrderRepository {

	List<Order> findAllOrders();

	Order findOrder(String orderId);

	void create(Order order);

}