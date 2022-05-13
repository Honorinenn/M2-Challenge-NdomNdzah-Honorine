package com.company.controllers;


import com.company.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.management.InvalidAttributeValueException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MonthController {




    private static List<Month> monthUnit = new ArrayList<>(Arrays.asList(
            new Month( "January", 1),
            new Month( "February", 2 ),
            new Month( "March", 3 ),
            new Month( "April", 4),
            new Month( "May", 5),
            new Month( "June", 6),
            new Month( "July", 7),
            new Month( "August", 8),
            new Month( "September", 9),
            new Month( "October", 10),
            new Month( "November", 11),
            new Month( "December", 12)


    ));

    @RequestMapping(value="/month/{number}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Month getMonthByNumber(@PathVariable int number)  {

        Month found = null;

        for(Month month : monthUnit) {
            if(month.getNumber() == number) {
                found = month;
                break;
            }
        }
        if (found != null) {

            return found;
        }else {
            throw new IllegalArgumentException("bad month");
        }
    }

    @RequestMapping(value="/randomMonth", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)

    public Month randomMonth() {
        //Random month generator
        Random rnd = new Random();
        // this makes one from 0 to 11
        int randomInt = rnd.nextInt(12);
        int correctInt = randomInt + 1;
        System.out.println(correctInt);


        Month found = null;

        for (Month month : monthUnit) {
            if (month.getNumber() == correctInt) {
                return month;
            }
        }

        return found;
    }
    }