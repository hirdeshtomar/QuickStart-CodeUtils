package com.hito.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {
	
	String orderId;
	
	String orderItem;

	public String getOrderId() {
		return orderId;
	}

	public String getOrderItem() {
		return orderItem;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

}
