package com.udemyJSF.roshan;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CounterReq {
	
	private int value=0;
	
	public String increment(){
		value++;
		return "counter-req";
	}
	
	public CounterReq(){
		
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
