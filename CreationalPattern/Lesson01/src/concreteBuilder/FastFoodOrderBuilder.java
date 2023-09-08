/**
 * 
 */
package concreteBuilder;

import product.order.Order;
import product.type.BreadType;
import product.type.OrderType;
import product.type.SauceType;
import product.type.VegetableType;

/**
 * @author bahao
 *
 */
public class FastFoodOrderBuilder{

	private OrderType orderType;
	
	private BreadType breadType;
	
	private SauceType sauceType;
	
	private VegetableType vegetableType;
	public FastFoodOrderBuilder orderType(OrderType orderType) {
		// TODO Auto-generated method stub
		this.orderType = orderType;
		return this;
	}

	public FastFoodOrderBuilder orderBread(BreadType breadType) {
		// TODO Auto-generated method stub
		this.breadType = breadType;
		return this;
	}

	public FastFoodOrderBuilder orderSauce(SauceType sauceType) {
		// TODO Auto-generated method stub
		this.sauceType = sauceType;
		return this;
	}

	public FastFoodOrderBuilder orderVegetable(VegetableType vegetableType) {
		// TODO Auto-generated method stub
		this.vegetableType = vegetableType;
		return this;
	}

	public Order build() {
		// TODO Auto-generated method stub
		return new Order(orderType, breadType, sauceType, vegetableType);
	}

}
