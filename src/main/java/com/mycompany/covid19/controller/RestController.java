package com.mycompany.covid19.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.covid19.dto.DateReportDto;
import com.mycompany.covid19.dto.GlobalDto;
import com.mycompany.covid19.model.Covid19Report;
import com.mycompany.covid19.service.Covid19Service;


@Controller
@RequestMapping("/covid19")
@ConfigurationProperties
public class RestController {
	@Autowired
	Covid19Service covid19Service;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public GlobalDto getCovidGlobalData() {
		return covid19Service.getCovidGlobalData();
	}
	
	@RequestMapping(value = "/{country}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public DateReportDto getCovid19DataByCountry(@PathVariable("country") String country) {
		return covid19Service.getCovid19DataByCountry(country);
	}
	
	@RequestMapping(value = "/{country}/{state}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public DateReportDto getCovid19DataByState(@PathVariable("country") String country, @PathVariable("state") String state) {
		return null;
		//return customerService.getCustomer(id);

	}

}
