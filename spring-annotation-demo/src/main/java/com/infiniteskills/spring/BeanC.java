package com.infiniteskills.spring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value="ChooseMe")
@Lazy // Delay the bean injected
public class BeanC implements BeanNameAware, AccessibleBeanName {

	private String beanName;

	//@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return beanName;
	}

	public BeanC(){
		System.out.println("Instantiating BeanC()");
	}
}
