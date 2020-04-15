package com.mycompany.covid19.dto;

import java.util.ArrayList;
import java.util.List;

public class StateDto {
	
	String stateName;
	
	int totalConfirmedCases;
	
	int totalRecoveredCases;
	
	int totalDeaths;

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
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

}
