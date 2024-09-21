package com.parthenope.Autonoleggio.services.impl;
import com.parthenope.Autonoleggio.dto.ParkingDto;
import com.parthenope.Autonoleggio.models.Parking;
import com.parthenope.Autonoleggio.services.ParkingService;
import com.parthenope.Autonoleggio.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingServiceImpl implements ParkingService {
    private final ParkingRepository parkingRepository;
    @Autowired
    public ParkingServiceImpl(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }
    @Override
    public List<ParkingDto> findAllParkings(){
        List<Parking> parkings = parkingRepository.findAll();
        return parkings.stream().map(this::mapToParkingDto).collect(Collectors.toList());
    }

    private ParkingDto mapToParkingDto(Parking parking){
        ParkingDto parkingDto = ParkingDto.builder().build();
            parkingDto.setId(parking.getId());
            parkingDto.setCar(parking.getCar());
            parkingDto.setLocation(parking.getLocation());
            parkingDto.setStatus(parking.getStatus());
            return parkingDto;
    }
}
