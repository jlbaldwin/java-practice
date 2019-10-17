package com.company;

import static org.junit.jupiter.api.Assertions.*;

class TestRideTest {

    @org.junit.jupiter.api.Test
    void possibleRide() {
        int capacity1 = 5;
        //[riders, startDist, endDist]
        int [][] trip1 = {{2,1,5},{1,4,8},{2,3,7},{1,6,8},{3,10,11}};

        Boolean test1 = TestRide.possibleRide(capacity1, trip1);
        assertEquals(true, test1);

        int capacity2 = 5;
        //[riders, startDist, endDist]
        int [][] trip2 = {{2,1,5},{2,4,8},{2,3,7},{1,6,8},{3,10,11}};

        Boolean test2 = TestRide.possibleRide(capacity2, trip2);
        assertEquals(false, test2);

        int capacity3 = 1;
        //[riders, startDist, endDist]
        int [][] trip3 = {};

        Boolean test3 = TestRide.possibleRide(capacity3, trip3);
        assertEquals(true, test3);
    }
}