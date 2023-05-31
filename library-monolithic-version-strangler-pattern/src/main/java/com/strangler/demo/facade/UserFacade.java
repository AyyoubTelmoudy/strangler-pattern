package com.strangler.demo.facade;

import com.strangler.demo.model.User;

import java.util.List;

public interface UserFacade {
    public List<User> getAllUsers() ;

    public User getUserById(Long id);
    public User createUser(User user) ;

    public void deleteUser(Long id) ;
}
