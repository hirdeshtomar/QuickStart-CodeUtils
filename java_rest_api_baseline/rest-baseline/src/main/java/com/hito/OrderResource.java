package com.hito;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hito.model.Order;
import com.hito.repository.OrderRepository;
import com.hito.repository.OrderRepositoryStub;

@Path("orders") // http://localhost:8080/rest-baseline/webapi/orders
public class OrderResource {
	
	private OrderRepository orderRepo = new OrderRepositoryStub();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Order> getAllOrders(){
		
		return orderRepo.findAllOrders();
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("{orderId}") // http://localhost:8080/rest-baseline/webapi/orders/ID0001	
	public Order getOrder(@PathParam ("orderId") String orderId){
		
		return orderRepo.findOrder(orderId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("createOrder")
	public Order createOrder(Order order) {
		
		System.out.println(order.getOrderId());
		System.out.println(order.getOrderItem());
		
		orderRepo.create(order);
		
		return order;
		
	}

}
