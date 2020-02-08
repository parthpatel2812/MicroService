package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(value = {"field1"}) // we can give multiple field for ignor in response
@JsonFilter("SomeBeanFilter")
public class SomeBean
{
    private String field1;
    private String field2;
  //  @JsonIgnore  // we can ignor this feild in response
    private String field3;

    public SomeBean(String value1, String value2, String value3)
    {
        super();
        this.field1 = value1;
        this.field2 = value2;
        this.field3 = value3;
    }

    public String getField1()
    {
        return field1;
    }

    public void setField1(String field1)
    {
        this.field1 = field1;
    }

    public String getField2()
    {
        return field2;
    }

    public void setField2(String field2)
    {
        this.field2 = field2;
    }

    public String getField3()
    {
        return field3;
    }

    public void setField3(String field3)
    {
        this.field3 = field3;
    }

    @Override
    public String toString()
    {
        return "SomeBean{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                '}';
    }
}
