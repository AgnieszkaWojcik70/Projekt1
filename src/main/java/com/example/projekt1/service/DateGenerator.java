package com.example.projekt1.service;

import org.springframework.stereotype.Service;

@Service
public class DateGenerator {

    public String generateDate(Integer month) {
        return String.valueOf(month);
    }

    public String generateDate(Integer month, Integer year) {
        return month + "-" + year;
    }

    public String generateDate(Integer month, Integer year, Integer day) {
        return month + "-" + year + "-" + day;
    }
}
