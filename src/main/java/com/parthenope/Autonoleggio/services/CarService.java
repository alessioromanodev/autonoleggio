package com.parthenope.Autonoleggio.services;
import com.parthenope.Autonoleggio.dto.CarDto;
import java.util.List;

public interface CarService {
    List<CarDto> findAllCars();
}
