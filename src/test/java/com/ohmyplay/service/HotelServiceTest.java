package com.ohmyplay.service;

import com.ohmyplay.domain.Hotel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelServiceTest {

    @Autowired
    private HotelService hotelService;

    @Test
    public void 호텔_조회() {

        assertThat(hotelService, instanceOf(HotelService.class));

        Hotel hotel = hotelService.getHotel(1);

        assertThat(hotel.getCity(), is(1L));

    }
}
