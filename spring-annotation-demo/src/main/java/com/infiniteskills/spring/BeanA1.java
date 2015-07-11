package com.infiniteskills.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Lazy
public class BeanA1 {

	private AccessibleBeanName bean;

	public AccessibleBeanName getBean() {
		return bean;
	}
	
//	@Resource
//	@MagicBean //Customized Qualifier. Name of setter injection is unique and corresponding to injected Bean ID in .xml
	
//	@Autowired
//	@Qualifier(value="uniqueBeanName")

//	public void setUniqueBeanName(AccessibleBeanName bean) {
	
	@Autowired
	@Qualifier(value="ChooseMe")
	public void setBean(AccessibleBeanName bean) {
		this.bean = bean;
	}

	public BeanA1() {
		System.out.println("Instantiating BeanA1()");
	}
}
