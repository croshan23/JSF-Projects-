package com.udemyJSF.roshan;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class Counter {
	
	private int value=0;
	
	public String increment(){
		value++;
		return "counter";
	}
	
	public Counter(){
		
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
