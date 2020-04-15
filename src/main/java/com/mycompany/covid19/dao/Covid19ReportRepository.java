package com.mycompany.covid19.dao;




import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.covid19.model.Covid19Report;
import com.mycompany.covid19.model.GlobalData;

@Repository
public interface Covid19ReportRepository extends JpaRepository<Covid19Report, Integer> {
	

	@Query("SELECT new com.mycompany.covid19.model.GlobalData(sum(c.confirmed), sum(c.deaths), sum(c.recovered), max(c.dateReported))"+" FROM Covid19Report as c where c.dateReported in(select max(c1.dateReported) from Covid19Report as c1)")
	List<GlobalData> getCovidGlobalData();
	
	
	@Query("SELECT new com.mycompany.covid19.model.GlobalData(c.country,sum(c.confirmed), sum(c.deaths), sum(c.recovered), max(c.dateReported))"+" FROM Covid19Report as c where c.dateReported in(select max(c1.dateReported) from Covid19Report as c1) group by c.country, c.dateReported order by c.confirmed desc")
	List<GlobalData> getCovidDataGroupByCountry();

	
	@Query("SELECT new com.mycompany.covid19.model.GlobalData(c.country,c.confirmed,c.deaths,c.recovered,c.dateReported)"+" FROM Covid19Report c where c.country=:country order by c.dateReported desc")
	List<GlobalData> getCovidDataByCountry(@Param("country") String country);


}
