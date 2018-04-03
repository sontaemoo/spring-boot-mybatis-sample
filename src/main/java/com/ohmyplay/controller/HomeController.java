package com.ohmyplay.controller;

import com.ohmyplay.domain.City;
import com.ohmyplay.domain.Hotel;
import com.ohmyplay.service.CityService;
import com.ohmyplay.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    private HotelService hotelService;

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root(Model model) {

        Hotel hotel = hotelService.selectByCityId(1);
        City city = cityService.selectByCityId(1);

        model.addAttribute("hotel", hotel);
        model.addAttribute("city", city);

        return "index";
    }
}
