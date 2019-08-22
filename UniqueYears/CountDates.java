package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountDates {

    public static int countDates(String text){

        //create pattern to search for
        String patternString = "([0-9]{2})-([0-9]{2})-([0-9]{4})";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        //the map holds years as keys to test against
        Map uniqueYears = new HashMap();
        String year;

        while(matcher.find()){

            //save only the year from the date string
            year = matcher.group().substring(matcher.group().length() - 4);

            //if the year is not included in the map, add it
            if(uniqueYears.containsKey(year) == false) {
                uniqueYears.put(year, 1);
            }
        }
        return uniqueYears.size();
    }
}
