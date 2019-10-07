
package com.kodilla.testing.collection;

import org.junit.*;
import org.assertj.*;
import java.util.ArrayList;
import java.util.Arrays;
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
        filledList = Arrays.asList(1,2,3,4,5,6);

        //When
        obiekt.exterminate(filledList);
        List<Integer> parzyste = obiekt.getParzysteList();
        List<Integer> nieparzyste = obiekt.getNieparzysteList();
        System.out.println("Testing method testOddNumbersExterminatorNormalList ");
        //Then
        Assert.assertEquals(parzyste.size(), 3);
        Assert.assertEquals(nieparzyste.size(), 3);
    }
}
