package com.jedi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseBase {



    private Coordinates coordinates;
    private ArrayList<Weather> weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;
    private Long dt;
    private Sys sys;
    private Long id;
    private String name;
    private int cod;
}
