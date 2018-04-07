package com.ohmyplay.mapper;

import com.ohmyplay.domain.Hotel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HotelMapper {

    Hotel selectByCityId(int city_id);

    List<Hotel> selectHotelList();
}