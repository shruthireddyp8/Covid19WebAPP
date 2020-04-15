package com.mycompany.covid19.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CountryDto {
	
	String countryName;
	
	int totalConfirmedCases;
	
	int totalRecoveredCases;
	
	int totalDeaths;
	
	Date dateReported;
	

	List<StateDto> states = new ArrayList<StateDto>();

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getTotalConfirmedCases() {
		return totalConfirmedCases;
	}

	public void setTotalConfirmedCases(int totalConfirmedCases) {
		this.totalConfirmedCases = totalConfirmedCases;
	}

	public int getTotalRecoveredCases() {
		return totalRecoveredCases;
	}

	public void setTotalRecoveredCases(int totalRecoveredCases) {
		this.totalRecoveredCases = totalRecoveredCases;
	}

	public int getTotalDeaths() {
		return totalDeaths;
	}

	public void setTotalDeaths(int totalDeaths) {
		this.totalDeaths = totalDeaths;
	}

	public List<StateDto> getStates() {
		return states;
	}

	public void setStates(List<StateDto> states) {
		this.states = states;
	}
	
	public Date getDateReported() {
		return dateReported;
	}

	public void setDateReported(Date dateReported) {
		this.dateReported = dateReported;
	}

}
