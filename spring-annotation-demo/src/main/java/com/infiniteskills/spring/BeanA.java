package com.infiniteskills.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class BeanA {

	private BeanD beanD;
	//private BeanC beanC;

	public BeanD getBeanD() {
		return beanD;
	}
	
	@Autowired
//	@MagicBean
	@Qualifier(value="beanD2") //No qualifier setting in .xml file as value is used Bean ID; if value is "Choose me", need to set the qualifier value in .xml file
//	@Scope(value="singleton")
	
	public void setBeanD(BeanD beanD) {
		this.beanD = beanD;
	}

//	@Autowired(required=false)
//	public BeanA(BeanB beanB) {
//		super();
//		System.out.println("Constructor called: BeanA(BeanB beanB)");
//		this.beanB = beanB;
//	}
//	
//	@Autowired(required=false)
//	public BeanA(BeanB beanB, BeanC beanC) {
//		super();
//		System.out.println("Constructor called: BeanA(BeanB beanB, BeanC beanC)");
//		this.beanB = beanB;
//		this.beanC = beanC;
//	}
//
//	public BeanB getBeanB() {
//		return beanB;
//	}
//
//	public BeanC getBeanC() {
//		return beanC;
//	}

	
}
