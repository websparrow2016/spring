package org.websparrow.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.websparrow.beans.Car;

public class Dealer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Car car = (Car) context.getBean("c");
		car.carDetails();
	}
}
