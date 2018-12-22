package com.example.demo.persistence;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.impl.City;

@Mapper
public interface ICityMapper {
	 
	/**
	 *注解
	 */
	@Select("select * from city where state = #{state}")
	City findByState(@Param("state") String state);
	
	/**xml 
	 */
	City selectCityById(int city_id);

}
