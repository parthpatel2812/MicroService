package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PostsController
{

    @Autowired
    private UserDao dao;

    @PostMapping(value = "/users/{id}/post")
    public void retriveUser(@PathVariable Integer id, @RequestBody User user)
    {
        User users = dao.findOne(id);
        dao.savePost(users.getId(), user.getPosts().get(0), user.getPosts().get(0).getPostId());
    }
}
