package com.ohmyplay.mapper;

import com.ohmyplay.domain.Hotel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@MybatisTest
public class HotelMapperTest {

    @Autowired
    private HotelMapper hotelMapper;

    @Test
    public void selectByCityIdTest() {
        Hotel hotel = hotelMapper.selectByCityId(1);
        assertThat(hotel.getName()).isEqualTo("Conrad Treasury Place1");
        assertThat(hotel.getAddress()).isEqualTo("William & George Streets1");
        assertThat(hotel.getZip()).isEqualTo("4001");
    }
}
