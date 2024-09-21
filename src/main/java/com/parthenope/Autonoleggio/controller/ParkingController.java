package com.parthenope.Autonoleggio.controller;

import com.parthenope.Autonoleggio.dto.ParkingDto;
import com.parthenope.Autonoleggio.services.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class ParkingController {

    private final ParkingService parkingService;

    @Autowired
    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @GetMapping("/parking")
    public String listParkings(Model model) {
        List<ParkingDto> parkings = parkingService.findAllParkings();
        model.addAttribute("parkings", parkings);
        return "parkings-list";
    }
}
