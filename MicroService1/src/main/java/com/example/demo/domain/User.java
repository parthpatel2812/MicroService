package com.example.demo.domain;

import java.util.Date;
import java.util.List;

public class User
{
    private Integer     id;
    private String      name;
    private Date        birthDate;
    private List<Posts> posts;

    public User(Integer id, String name, Date birthDate, List<Posts> posts)
    {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.posts = posts;
    }

    public User()
    {

    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public List<Posts> getPosts()
    {
        return posts;
    }


    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                /*", posts=" + posts +*/
                '}';
    }
}
