package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	@SuppressWarnings("resource")
	public static void main(String[] args)  throws InterruptedException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		Thread.sleep(3000);
		
		BeanA1 beanA1 = context.getBean("beanA1", BeanA1.class);
		//System.out.println(beanA.getMyProperty()); 
		//System.out.println(beanA.getBeanB().getBeanD().getMyProperty());
		System.out.println(beanA1.getBean().getBeanName());
		
//		BeanA1 beanA1 = context.getBean("beanA1", BeanA1.class);
//		for (BeanD bean: beanA1.getBeanDs() ){
//			System.out.println(bean.getMyProperty());
//		}
	}
}
