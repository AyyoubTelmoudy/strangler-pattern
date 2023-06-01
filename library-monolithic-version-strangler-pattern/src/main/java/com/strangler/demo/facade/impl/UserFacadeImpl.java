package com.strangler.demo.facade.impl;

import com.strangler.demo.facade.UserFacade;
import com.strangler.demo.model.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@AllArgsConstructor
public class UserFacadeImpl implements UserFacade {
    @Autowired
    private final  RestTemplate restClient;

    @Override
    public List<User> getAllUsers() {return null;}

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
