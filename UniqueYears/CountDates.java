package com.company;

/*
    Given a string, find the count of unique years mentioned in the string. Valid dates to count will always be in the
    format DD-MM-YYYY.
    For example: String = "blah blah 05-05-1920 blah 05-05-1919 blah 04-04-1920" has 2 unique years.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountDates {

    public static int countDates(String text){

        //create pattern to search for. Valid dates are only DD-MM-YYYY
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
