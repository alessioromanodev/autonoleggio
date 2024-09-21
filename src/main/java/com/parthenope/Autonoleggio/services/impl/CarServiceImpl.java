package com.parthenope.Autonoleggio.services.impl;
import com.parthenope.Autonoleggio.dto.CarDto;
import com.parthenope.Autonoleggio.models.Car;
import com.parthenope.Autonoleggio.services.CarService;
import com.parthenope.Autonoleggio.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<CarDto> findAllCars(){
        List<Car> cars = carRepository.findAll();
        return cars.stream().map(this::mapToCarDto).collect(Collectors.toList());
    }

    private CarDto mapToCarDto(Car car){
        CarDto carDto = CarDto.builder().build();
        carDto.setId(car.getId());
        carDto.setBrand(car.getBrand());
        carDto.setModel(car.getModel());
        carDto.setColor(car.getColor());
        carDto.setYear(car.getYear());
        return carDto;
    }
}
