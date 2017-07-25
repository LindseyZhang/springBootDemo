package com.demo.user.api.facade;

import com.demo.user.api.command.CreateUserCommand;
import com.demo.user.model.User;
import com.demo.user.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

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
}
