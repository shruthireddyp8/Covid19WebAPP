package com.mycompany.covid19.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GlobalDto {
	
	String globalName;
	
	int totalConfirmedCases;
	
	int totalRecoveredCases;
	
	int totalDeaths;
	
	Date dateReported;
	
	List<CountryDto> countries;
	
	String response;
	
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Date getDateReported() {
		return dateReported;
	}

	public void setDateReported(Date dateReported) {
		this.dateReported = dateReported;
	}

	
	
	public String getGlobalName() {
		return globalName;
	}

	public void setGlobalName(String globalName) {
		this.globalName = globalName;
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

	public List<CountryDto> getCountries() {
		return countries;
	}

	public void setCountries(List<CountryDto> countries) {
		this.countries = countries;
	}


}
