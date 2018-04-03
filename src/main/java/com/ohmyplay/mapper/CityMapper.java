package com.ohmyplay.mapper;

import com.ohmyplay.domain.City;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityMapper {

    City selectCityById(int id);
}
