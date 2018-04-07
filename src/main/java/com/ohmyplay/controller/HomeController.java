package com.ohmyplay.controller;

import com.ohmyplay.domain.City;
import com.ohmyplay.domain.Hotel;
import com.ohmyplay.exception.OhmyplayException;
import com.ohmyplay.service.CityService;
import com.ohmyplay.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private HotelService hotelService;

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root(Model model) {

        List<Hotel> hotelList = hotelService.getHotelList();
        City city = cityService.getCity(1);

        model.addAttribute("hotelList", hotelList);
        model.addAttribute("city", city);

        return "index";
    }

    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    public String exception(Model model) {

        throw new OhmyplayException("error");
    }


}
