package com.example.pwco1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

@RestController
public class Hello {
    @GetMapping("/")
    public String hello(){

        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT+1:00")));
        String czas1 = "Czas w Lublinie: " + cdt.format(System.currentTimeMillis());


        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT+11:00")));
        String czas2 = "Czas w Sydney: " + cdt.format(System.currentTimeMillis());


        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT-5:00")));
        String czas3 = "Czas w Nowym Yorku: " + cdt.format(System.currentTimeMillis());

        return czas1 + "<br>" + czas2 + "<br>" + czas3;

    }


}
