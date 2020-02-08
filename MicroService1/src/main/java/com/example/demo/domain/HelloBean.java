package com.example.demo.domain;

public class HelloBean
{
    private String message;

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public HelloBean(String x)
    {
        message = x;
    }

    @Override
    public String toString()
    {
        return "HelloBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
