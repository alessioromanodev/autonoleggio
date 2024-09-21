package com.parthenope.Autonoleggio.repository;

import com.parthenope.Autonoleggio.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
