package com.hito.repository;

import java.util.ArrayList;
import java.util.List;

import com.hito.model.Order;

public class OrderRepositoryStub implements OrderRepository {
	
	/* (non-Javadoc)
	 * @see com.hito.repository.OrderResource#findAll()
	 */
	@Override
	public List<Order> findAllOrders(){
		
		List<Order> orders = new ArrayList<Order>();
		
		Order order1 = new Order();
		
		order1.setOrderId("ID0001");
		order1.setOrderItem("Sample Item 1");
		
		orders.add(order1);
		
		Order order2 = new Order();
		
		order2.setOrderId("ID0002");
		order2.setOrderItem("Sample Item 2");
		
		orders.add(order2);
		
		return orders;
			
	}

	@Override
	public Order findOrder(String orderId) {	

		Order order1 = new Order();
		
		order1.setOrderId("ID0001");
		order1.setOrderItem("Sample Item 1");
		
		return order1;
	}
	
	
	

}
