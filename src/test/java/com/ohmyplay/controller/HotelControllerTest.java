package com.ohmyplay.controller;

import com.ohmyplay.controller.rest.HotelController;
import com.ohmyplay.domain.Hotel;
import com.ohmyplay.service.HotelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(HotelController.class)
@ActiveProfiles(value = "local")
public class HotelControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private HotelService hotelService;

    @Test
    public void 호텔_조회() throws Exception{

        Hotel hotel = new Hotel();
        hotel.setAddress("address");
        hotel.setCity(1L);
        hotel.setName("name");
        hotel.setZip("zip");

        doReturn(hotel).when(hotelService).getHotel(1);

        this.mockMvc.perform(get("/api/hotel/1")
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", containsString("name")))
                .andExpect(jsonPath("$.address", containsString("address")))
                .andExpect(jsonPath("$.zip", containsString("zip")))
                .andDo(print());
    }
}
