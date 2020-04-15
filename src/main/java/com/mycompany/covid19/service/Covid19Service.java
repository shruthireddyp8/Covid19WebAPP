package com.mycompany.covid19.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.mycompany.covid19.dao.Covid19ReportRepository;
import com.mycompany.covid19.dto.DateReportDto;
import com.mycompany.covid19.dto.GlobalDto;
import com.mycompany.covid19.dto.TableDataDto;
import com.mycompany.covid19.model.GlobalData;
import com.mycompany.covid19.dto.CountryDto;

@Service
public class Covid19Service {
	
	@Autowired
	Covid19ReportRepository repository;
	
	
	public GlobalDto getCovidGlobalData() {
		List<GlobalData> globalInfo = repository.getCovidGlobalData();
		List<GlobalData> countryInfo = repository.getCovidDataGroupByCountry();
		GlobalDto globalDto = new GlobalDto();
		for(GlobalData data:globalInfo) {
			globalDto.setGlobalName("World");
			globalDto.setTotalConfirmedCases(data.getTotalConfirmed());
			globalDto.setTotalDeaths(data.getTotalDeaths());
			globalDto.setTotalRecoveredCases(data.getTotalRecovered());
			globalDto.setDateReported(data.getDateReported());
		}
		
		List<CountryDto> countries = new ArrayList<CountryDto>();
		for(GlobalData data:countryInfo) {
			CountryDto countryDto = new CountryDto();
			countryDto.setCountryName(data.getCountryName());
			countryDto.setDateReported(data.getDateReported());
			countryDto.setTotalConfirmedCases(data.getTotalConfirmed());
			countryDto.setTotalDeaths(data.getTotalDeaths());
			countryDto.setTotalRecoveredCases(data.getTotalRecovered());
			countries.add(countryDto);
		}
		globalDto.setCountries(countries);
		return globalDto;
	}
	
	
	public DateReportDto getCovid19DataByCountry(String country) {
		List<GlobalData> countryDataByDate = repository.getCovidDataByCountry(country);
		DateReportDto dateReportDto = new DateReportDto();
		List<TableDataDto> tableList = new ArrayList<TableDataDto>();
		for(GlobalData data:countryDataByDate) {
			dateReportDto.setCountryName(data.getCountryName());
			TableDataDto tableDataDto = new TableDataDto();
			tableDataDto.setTotalConfirmedCases(data.getTotalConfirmed());
			tableDataDto.setTotalDeaths(data.getTotalDeaths());
			tableDataDto.setTotalRecoveredCases(data.getTotalRecovered());
			tableDataDto.setReportedDate(data.getDateReported());
			tableList.add(tableDataDto);
		}
		dateReportDto.setTable(tableList);
		return dateReportDto;
	}
	
	
	public DateReportDto getCovid19DataByState(String country, String state) {
		return null;
		//return customerService.getCustomer(id);

	}

}
