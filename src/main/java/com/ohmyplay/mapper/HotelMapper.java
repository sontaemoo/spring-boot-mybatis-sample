package com.ohmyplay.mapper;

import com.ohmyplay.domain.Hotel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HotelMapper {

    Hotel selectByCityId(int city_id);
}