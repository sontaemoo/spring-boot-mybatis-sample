package com.ohmyplay.controller.rest;

import com.ohmyplay.domain.Hotel;
import com.ohmyplay.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping(value = "{city_id}", produces =  MediaType.APPLICATION_JSON_VALUE)
    public Hotel hotel(@PathVariable("city_id") int cityId) {
        return hotelService.selectByCityId(cityId);
    }
}
