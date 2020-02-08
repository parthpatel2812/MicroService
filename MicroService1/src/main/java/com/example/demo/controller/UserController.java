package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.repository.UserDao;
import com.example.demo.util.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController
{
    @Autowired
    private UserDao dao;

    @GetMapping(value = "/users")
    public List<User> retriveAllUsers()
    {
        return dao.findAll();
    }


    @GetMapping(value = "/users/{id}")
    public User retriveUser(@PathVariable Integer id)

    {
        User user = dao.findOne(id);

        if (user.getId() == null)
            throw new UserNotFoundException("id - " + id);

        return user;
    }


    @PostMapping(value = "/users")
    public ResponseEntity<Object> addUser(@RequestBody User user)
    {
        User savedUser = dao.save(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{/id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
}
