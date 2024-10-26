package com.parthenope.Autonoleggio.controller;
import org.springframework.ui.Model;
import com.parthenope.Autonoleggio.dto.CarDto;
import com.parthenope.Autonoleggio.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<CarDto> cars = carService.findAllCars();
        model.addAttribute("cars", cars);
        System.out.println(cars);
        return "home";
    }
}
