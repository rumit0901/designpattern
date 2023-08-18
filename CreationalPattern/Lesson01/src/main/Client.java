package main;

import concreteBuilder.FastFoodOrderBuilder;
import product.order.Order;
import product.type.BreadType;
import product.type.OrderType;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new FastFoodOrderBuilder().orderType(OrderType.ON_SITE)
				.orderBread(BreadType.OMELETTE)
				.build();
		System.out.println(order);
	}

}
