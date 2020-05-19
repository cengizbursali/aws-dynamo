package com.cengizbursali.aws.service;

import com.cengizbursali.aws.domain.User;
import com.cengizbursali.aws.model.UserCreateRequest;
import com.cengizbursali.aws.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void createUser(UserCreateRequest userCreateRequest) {

        final User user = User.builder()
                .name(userCreateRequest.getName())
                .build();

        userRepository.save(user);
    }
}
