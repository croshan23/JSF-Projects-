package com.udemyJSF.roshan;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TourBean {
	
	private String kindOfTour;
	
	public TourBean(){
		
	}

	public String startTheTour(){
		if(kindOfTour != null && kindOfTour.equals("city")){
			return "city-tour";
		}else{
			return "country-tour";
		}
	}
	
	public String getKindOfTour() {
		return kindOfTour;
	}

	public void setKindOfTour(String kindOfTour) {
		this.kindOfTour = kindOfTour;
	}
	
}
