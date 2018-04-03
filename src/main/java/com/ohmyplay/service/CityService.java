package com.ohmyplay.service;

import com.ohmyplay.domain.City;
import com.ohmyplay.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    public City selectByCityId(int city_id) {
        return cityMapper.selectCityById(city_id);
    }
}
