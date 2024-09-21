package com.parthenope.Autonoleggio.repository;

import com.parthenope.Autonoleggio.models.Parking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingRepository extends JpaRepository<Parking, Long> {
}
