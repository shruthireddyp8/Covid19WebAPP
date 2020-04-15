package com.mycompany.covid19.model;

import java.util.Date;


public class GlobalData {
	
	
	String countryName;
	
	int totalConfirmed;
	
	int totalDeaths;
	
	int totalRecovered;
	
	Date dateReported;
	
	public GlobalData(){
		
	}
	
	public GlobalData(long totalConfirmed,long totalDeaths,long totalRecovered,Date dateReported) {
		this.totalConfirmed = (int)totalConfirmed;
		this.totalDeaths = (int)totalDeaths;
		this.totalRecovered = (int)totalRecovered;
		this.dateReported = dateReported;
	}
	
	public GlobalData(String countryName,long totalConfirmed,long totalDeaths,long totalRecovered,Date dateReported) {
		this.countryName = countryName;
		this.totalConfirmed = (int)totalConfirmed;
		this.totalDeaths = (int)totalDeaths;
		this.totalRecovered = (int)totalRecovered;
		this.dateReported = dateReported;
	}
	
	public GlobalData(String countryName,int totalConfirmed,int totalDeaths,int totalRecovered,Date dateReported) {
		this.countryName = countryName;
		this.totalConfirmed = (int)totalConfirmed;
		this.totalDeaths = (int)totalDeaths;
		this.totalRecovered = (int)totalRecovered;
		this.dateReported = dateReported;
	}
	
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getTotalConfirmed() {
		return totalConfirmed;
	}

	public void setTotalConfirmed(int totalConfirmed) {
		this.totalConfirmed = totalConfirmed;
	}

	public int getTotalDeaths() {
		return totalDeaths;
	}

	public void setTotalDeaths(int totalDeaths) {
		this.totalDeaths = totalDeaths;
	}

	public int getTotalRecovered() {
		return totalRecovered;
	}

	public void setTotalRecovered(int totalRecovered) {
		this.totalRecovered = totalRecovered;
	}

	public Date getDateReported() {
		return dateReported;
	}

	public void setDateReported(Date dateReported) {
		this.dateReported = dateReported;
	}


}
