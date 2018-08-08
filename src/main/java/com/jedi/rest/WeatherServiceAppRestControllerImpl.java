package com.jedi.rest;

import com.jedi.model.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherServiceAppRestControllerImpl implements WeatherServiceAppRestController {

    @Autowired
    private WeatherClient weatherClient;

    @Value("${weatherapi.endpoint.apiKey}")
    private String apiKey;

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String helloWeatherService(){
        return "Hello Weather Service App!";
    }

    @RequestMapping(path = "/weatherByLocation", method = RequestMethod.GET)
    public ResponseEntity<ResponseBase> getWeatherForLocation(String location){
        return weatherClient.getWeatherByLocationName(location, apiKey);
    }

}
