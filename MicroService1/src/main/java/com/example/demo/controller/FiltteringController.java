package com.example.demo.controller;

import com.example.demo.domain.SomeBean;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FiltteringController
{
    // field1 , field2
    @GetMapping(value = "filtter")
    public MappingJacksonValue retriveSomeBean()
    {
        SomeBean someBean = new SomeBean("value1", "value2", "value3");

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("field1", "field2");

        FilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter("SomeBeanFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(someBean);
        mapping.setFilters(filterProvider);

        return mapping;
    }

    // field3
    @GetMapping(value = "filtter-list")
    public MappingJacksonValue retrivelistSomeBean()
    {
        List<SomeBean> list = Arrays.asList(new SomeBean("value1", "value2", "value3"),
                new SomeBean("value11", "value22", "value33"));

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("field3");

        FilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter("SomeBeanFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(list);
        mapping.setFilters(filterProvider);

        return mapping;
    }
}
