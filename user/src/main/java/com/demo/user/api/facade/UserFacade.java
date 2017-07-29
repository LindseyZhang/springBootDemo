package com.demo.user.api.facade;

import com.demo.user.api.command.AuthenticationCommand;
import com.demo.user.api.command.CreateUserCommand;
import com.demo.user.api.dto.UserInfoDTO;
import com.demo.user.model.User;
import com.demo.user.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;

@Component
@Transactional
public class UserFacade {
    private UserRepository userRepository;

    @Autowired
    public UserFacade(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Long addUser(CreateUserCommand createUserCommand) {
        User user = User.user().withAddress(createUserCommand.getAddress())
                .withPassword(createUserCommand.getPassword())
                .withUsername(createUserCommand.getUsername())
                .withPhone(createUserCommand.getPhone())
                .build();
        return userRepository.store(user);
    }

    public UserInfoDTO get(Long id) {
        User user = userRepository.get(id).orElseThrow(NotFoundException::new);
        return toUserInfoDTO(user);
    }

    private UserInfoDTO toUserInfoDTO(User user) {
        return UserInfoDTO.userInfoDTO()
                .withAddress(user.getAddress())
                .withPhone(user.getPhone())
                .withUsername(user.getUsername())
                .withId(user.getId()).build();
    }

    public UserInfoDTO login(AuthenticationCommand authCommand) {
        User user = userRepository.auth(authCommand.getUsername(), authCommand.getPassword()).orElseThrow(NotFoundException::new);
        return toUserInfoDTO(user);
    }
}
