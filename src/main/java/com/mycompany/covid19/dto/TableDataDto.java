package com.mycompany.covid19.dto;

import java.util.Date;

public class TableDataDto {
	
    int totalConfirmedCases;
	
	int totalRecoveredCases;
	
	int totalDeaths;
	
	Date reportedDate;

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

	public Date getReportedDate() {
		return reportedDate;
	}

	public void setReportedDate(Date reportedDate) {
		this.reportedDate = reportedDate;
	}
	

}
