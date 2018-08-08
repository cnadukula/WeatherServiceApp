package com.jedi.rest;

import com.jedi.model.ResponseBase;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "weatherapi", url="${weatherapi.endpoint.url}")
public interface WeatherClient {

    @RequestMapping(method = RequestMethod.GET, value = "?q={location}&appid={apiKey}")
    ResponseEntity<ResponseBase> getWeatherByLocationName(@PathVariable("location") String location, @PathVariable("apiKey") String apiKey);

}
