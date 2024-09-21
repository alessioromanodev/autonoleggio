package com.parthenope.Autonoleggio.services;
import com.parthenope.Autonoleggio.dto.ParkingDto;
import java.util.List;

public interface ParkingService {
    List<ParkingDto> findAllParkings();
}
