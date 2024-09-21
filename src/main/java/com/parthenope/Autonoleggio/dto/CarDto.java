package com.parthenope.Autonoleggio.dto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarDto {
    private Long id;
    private String brand;
    private String model;
    private String type;
    private String color;
    private int year;
    private String status;
    private double hourlyRate;
}


