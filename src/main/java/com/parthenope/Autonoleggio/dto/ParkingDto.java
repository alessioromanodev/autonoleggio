package com.parthenope.Autonoleggio.dto;
import com.parthenope.Autonoleggio.models.Car;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class ParkingDto {
    private Long id;
    private List<Car> car;
    private String location;
    private String status;
}

