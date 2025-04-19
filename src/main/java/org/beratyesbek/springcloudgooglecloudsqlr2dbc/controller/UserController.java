package org.beratyesbek.springcloudgooglecloudsqlr2dbc.controller;

import lombok.RequiredArgsConstructor;
import org.beratyesbek.springcloudgooglecloudsqlr2dbc.entity.User;
import org.beratyesbek.springcloudgooglecloudsqlr2dbc.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserRepository userRepository;


    @GetMapping
    public Flux<User> findAll() {
        return userRepository.findAll().doOnNext(
                user -> System.out.println(Thread.currentThread().getName() + " - User: " + user)
        );
    }
}
