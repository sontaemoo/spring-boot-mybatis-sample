package com.ohmyplay.service;

import com.ohmyplay.domain.Hotel;
import com.ohmyplay.mapper.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    public Hotel getHotel(int city_id) {
        return hotelMapper.selectByCityId(city_id);
    }

    public List<Hotel> getHotelList() {
        return hotelMapper.selectHotelList();
    }
}
