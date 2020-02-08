package com.example.demo.domain;

public class Posts
{

    private Integer postId;
    private String  postDetails;

    public Posts(Integer postId, String postDetails)
    {
        this.postId = postId;
        this.postDetails = postDetails;
    }

    public Integer getPostId()
    {
        return postId;
    }

    public String getPostDetails()
    {
        return postDetails;
    }

    @Override
    public String toString()
    {
        return "Posts{" +
                "postId=" + postId +
                ", postDetails='" + postDetails + '\'' +
                '}';
    }
}
