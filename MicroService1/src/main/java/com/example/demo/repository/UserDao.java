package com.example.demo.repository;

import com.example.demo.domain.Posts;
import com.example.demo.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDao
{
    private static List<User> userList = new ArrayList<>();

    private static int userCount = 5;
    private static int postId    = 0;

    static
    {
        userList.add(new User(1, "parth", new Date(), new ArrayList<>()));
        userList.add(new User(2, "mira", new Date(), new ArrayList<>()));
        userList.add(new User(3, "jodi", new Date(), new ArrayList<>()));
        userList.add(new User(4, "urvesh", new Date(), new ArrayList<>()));
        userList.add(new User(5, "nalin", new Date(), new ArrayList<>()));
    }

    public List<User> findAll()
    {
        return userList;
    }


    public User save(User user)
    {
        if (user.getId() == null)
        {
            userCount++;
            user.setId(userCount);
        }

        userList.add(user);

        return user;
    }

    public User findOne(Integer id)
    {
        User user = new User();

        for (User u : userList)
        {
            if (u.getId() == id)
            {
                user = u;
            }
        }
        return user;
    }

    public void savePost(Integer id, Posts posts, int postId)
    {

        for (User u : userList)
            if (u.getId() == id)
            {
                Posts posts1 = new Posts(postId, posts.getPostDetails());
                List<Posts> p = new ArrayList<>();
                p.add(posts1);
                u.getPosts().add(posts1);
            }
    }
}


