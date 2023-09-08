package aop.handler.impl;

import java.lang.reflect.InvocationHandler;

/* 
 * InvocationHandler interface has 2 method: abstract method named 'invoice' and a static method named 'invokeDefault'
 * Because AbtractHandler is an abstract class, we do not need to implement the 'invoice' method
 * This this a special feature of abstract class
 */
public abstract class AbtractHandler implements InvocationHandler {

	private Object targetObject;

	public Object getTargetObject() {
		return targetObject;
	}

	public void setTargetObject(Object targetObject) {
		this.targetObject = targetObject;
	}
	
	
}
