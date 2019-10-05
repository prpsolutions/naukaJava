
package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList  (){
        //Given
        OddNumbersExterminator obiekt = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //When
        obiekt.exterminate(emptyList);
        System.out.println("Testing method testOddNumbersExterminatorNormalList ");
        //Then
        Assert.assertEquals(obiekt.getParzysteList().isEmpty(), true);
    }

    @Test
    public void testOddNumbersExterminatorNormalList  (){
        //Given
        OddNumbersExterminator obiekt = new OddNumbersExterminator();
        List<Integer>  filledList = new ArrayList<>();
        Integer x = 1;
        for (int i = 0; i < 100; i++) {
            filledList.add(x);
            x++;
        }
        //When
        ArrayList<Integer> result = obiekt.exterminate(filledList);
        System.out.println("Testing method testOddNumbersExterminatorNormalList ");
        //Then
        Assert.assertEquals(obiekt.getParzysteList(), result);
    }
}
