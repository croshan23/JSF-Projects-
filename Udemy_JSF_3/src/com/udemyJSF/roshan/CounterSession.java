package com.udemyJSF.roshan;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CounterSession {
	
	private int value=0;
	
	public String increment(){
		value++;
		return "counter-session";
	}
	
	public CounterSession(){
		
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
