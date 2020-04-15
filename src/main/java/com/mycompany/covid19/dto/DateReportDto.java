package com.mycompany.covid19.dto;

import java.util.ArrayList;
import java.util.List;

public class DateReportDto {
	
	String countryName;
	
	List<TableDataDto> table = new ArrayList<TableDataDto>();

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<TableDataDto> getTable() {
		return table;
	}

	public void setTable(List<TableDataDto> table) {
		this.table = table;
	}

}
