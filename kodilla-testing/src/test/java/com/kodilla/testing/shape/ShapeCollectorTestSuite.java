package com.kodilla.testing.shape;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;


public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector testingObject = new ShapeCollector();
        Shape kolo = new Circle(10);
        //When
        testingObject.addFigure(kolo);
        //Then
        assertEquals(1, testingObject.getShapeCollection().size());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector testingObject = new ShapeCollector();
        Shape kolo = new Circle(10);
        testingObject.addFigure(kolo);
        //When
        testingObject.removeFigure(kolo);
        //Then
        assertEquals(0, testingObject.getShapeCollection().size());
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector testingObject = new ShapeCollector();
        Shape kolo = new Circle(10);
        testingObject.addFigure(kolo);
        //When
        Shape result = testingObject.getFigure(0);
        //Then
        assertEquals(kolo, result);
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape kolo = new Square(4);
        shapeCollector.addFigure(kolo);
        ArrayList<Shape> shapeList= new ArrayList<>();
        shapeList.add(kolo);
        //When
        List<Shape> shapeResultList = shapeCollector.getShapeCollection();
        //Then
        assertEquals(shapeList.toString(), shapeResultList.toString());
    }
}