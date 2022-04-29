package com.flightcompany.util;

import com.flightcompany.model.FlightAverage;
import com.flightcompany.model.FlightAverageRequest;
import com.flightcompany.web.skypicker.model.flightresponse.BagsPrice;
import com.flightcompany.web.skypicker.model.flightresponse.FlightResponse;
import com.flightcompany.web.skypicker.model.flightresponse.ResponseData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class FlightAverageUtilTest {

    @Mock
    FlightAverageUtil flightAverageUtil;

    @BeforeEach
    void init() {

        FlightResponse mockFlightResponse = mockFlightResponse();
        List<ResponseData> data = mockFlightResponse.getData();

        when(flightAverageUtil.calculateFlightAverage(any(FlightAverageRequest.class))).thenCallRealMethod();
        when(flightAverageUtil.getFlightResponse(any(FlightAverageRequest.class))).thenReturn(mockFlightResponse());
        when(flightAverageUtil.getAveragePrice(data)).thenCallRealMethod();
        when(flightAverageUtil.getFirstBagAveragePrice(data)).thenCallRealMethod();
        when(flightAverageUtil.getSecondBagAveragePrice(data)).thenCallRealMethod();

    }

    @Test
    void test() {
        FlightAverage flightAverage = flightAverageUtil.calculateFlightAverage(mockFlightAverageRequest());
        assertEquals(20, flightAverage.getAveragePrice(),"Average price shoulb be equals to 20");
        assertEquals(20, flightAverage.getFirstBagAveragePrice(),"First bag average price shoulb be equals to 20");
        assertEquals(30, flightAverage.getSecondBagAveragePrice(),"Second bag average price shoulb be equals to 30");
    }

    private FlightAverageRequest mockFlightAverageRequest() {
        return FlightAverageRequest.builder()
                .dateFrom("2022-04-30T00:00")
                .dateTo("2022-05-10T00:00")
                .flyFrom("OPO")
                .flyTo("LIS")
                .build();
    }

    private FlightResponse mockFlightResponse() {

        return FlightResponse.builder()
                .data(getResponseDataList())
                .build();

    }

    private List<ResponseData> getResponseDataList() {
        List<ResponseData> responseDataList = new ArrayList();
        ResponseData data1 = ResponseData.builder()
                .price(10)
                .bagsPrice(
                        BagsPrice.builder()
                                .firstBagPrice(15)
                                .secondBagPrice(20)
                                .build()
                )
                .build();
        ResponseData data2 = ResponseData.builder()
                .price(20)
                .bagsPrice(
                        BagsPrice.builder()
                                .firstBagPrice(25)
                                .secondBagPrice(30)
                                .build()
                )
                .build();
        ResponseData data3 = ResponseData.builder()
                .price(30)
                .bagsPrice(
                        BagsPrice.builder()
                                .firstBagPrice(20)
                                .secondBagPrice(40)
                                .build()
                )
                .build();
        responseDataList.add(data1);
        responseDataList.add(data2);
        responseDataList.add(data3);
        return responseDataList;
    }

}