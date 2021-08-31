package com.cloud.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().minusMonths(13));
    }
}
