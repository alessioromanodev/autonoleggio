package com.parthenope.Autonoleggio.services;
import com.parthenope.Autonoleggio.dto.UserDto;
import java.util.List;

public interface UserService {
    List<UserDto> findAllUsers();
}
