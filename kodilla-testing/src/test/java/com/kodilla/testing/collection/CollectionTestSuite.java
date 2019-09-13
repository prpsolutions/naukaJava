package com.kodilla.testing.collection;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList (){
        //Given
        OddNumbersExterminator obiekt = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = obiekt. getParzysteList();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals("theForumUser", result);
    }

}
