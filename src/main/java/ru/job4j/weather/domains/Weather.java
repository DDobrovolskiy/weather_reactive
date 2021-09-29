package ru.job4j.weather.domains;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Weather {
    private int id;
    private String city;
    private int temperature;
}
