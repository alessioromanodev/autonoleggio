package com.parthenope.Autonoleggio.services.impl;

import com.parthenope.Autonoleggio.dto.UserDto;
import com.parthenope.Autonoleggio.models.User;
import com.parthenope.Autonoleggio.repository.UserRepository;
import com.parthenope.Autonoleggio.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> findAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(this::mapToUserDto).collect(Collectors.toList());
    }

    private UserDto mapToUserDto(User user) {
        UserDto userDto = UserDto.builder().build();
        userDto.setId(user.getId());
        userDto.setTransactions(user.getTransactions());
        userDto.setPremium(user.isPremium());
        return userDto;
    }
}
