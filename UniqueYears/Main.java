package com.company;
/*
    Given a string, find the count of unique years mentioned in the string. Valid dates to count will always be in the
    format DD-MM-YYYY.
    For example: String = "blah blah 05-05-1920 blah 05-05-1919 blah 04-04-1920" has 2 unique years.
*/

public class Main {

    public static void main(String[] args) {
        String test1 = "I need a fake passport, preferably to France… I like the way they think. " +
                "I know, I just call her Annabelle 05-10-1918 cause she's shaped like a…she's the belle of the " +
                "ball! What do you expect, Mother? I'm half 12-10-1918 machine! I'm a monster!! God knows " +
                "they're 10-03-1922 squinters.";

        String test2 = "[sniffs hand] Oh, God. I'm going to run this through again on \"pots and pans.\" Let me " +
                "take off my assistant's skirt and put on my Barbra-Streisand-in-The-Prince-of-Tides ass-masking " +
                "therapist pantsuit. ";

        String test3 = "Chickens don't clap! I could use a 28-02-1920 leather jacket for when I'm on my hog and have " +
                "to go into a controlled slide.";

        String test4 = "Her lawyers are claiming the seal is worth $250,000. And that's not even including 05-05-05" +
                "Buster's 1-1-1924 Swatch.";

        String [] tests = {test1, test2, test3, test4};
        int [] expectedResult = {2, 0, 1, 0};

        for(int i = 0; i < tests.length; i++){
            int actualResult = CountDates.countDates(tests[i]);
            if(actualResult == expectedResult[i]){
                System.out.println("Test " + (i + 1) + ": PASS  (Expected: " + expectedResult[i] + " Actual: " + actualResult + ")");
            }
            else{
                System.out.println("Test " + (i+ 1) + ": FAIL  (Expected: " + expectedResult[i] + " Actual: " + actualResult + ")");
            }
        }
    }
}
