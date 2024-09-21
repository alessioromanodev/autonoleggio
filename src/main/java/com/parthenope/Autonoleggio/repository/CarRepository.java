package com.parthenope.Autonoleggio.repository;

import com.parthenope.Autonoleggio.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Long> {
    Optional<Car> findByModel(String model);
    Optional<Car> findByBrand(String brand);
    Optional<Car> findByStatus(String status);
}
