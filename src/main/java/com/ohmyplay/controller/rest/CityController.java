package com.ohmyplay.controller.rest;

import com.ohmyplay.domain.City;
import com.ohmyplay.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/city")
public class CityController {

    @Autowired
    private CityMapper cityMapper;

    @GetMapping(value = "{city_id}", produces =  MediaType.APPLICATION_JSON_VALUE)
    public City hotel(@PathVariable("city_id") int cityId) {
        return cityMapper.selectCityById(cityId);
    }
}
