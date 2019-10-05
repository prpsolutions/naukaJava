package com.kodilla.testing;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;

public class ShapeMain {
    public static void main(String[] args) {

        Triangle trojkat = new Triangle(2,5);
        System.out.println(trojkat);
        System.out.println("Pole powierzchni to " + trojkat.getField() + "cm2");

        System.out.println(" ");

        Circle kolo = new Circle(5);
        System.out.println(kolo);
        System.out.println("Pole powierzchni to " + kolo.getField() + "cm2");

        System.out.println(" ");

        Square kwadrat = new Square(10);
        System.out.println(kwadrat);
        System.out.println("Pole powierzchni to " + kwadrat.getField() + "cm2");


        ShapeCollector obiekt = new ShapeCollector();
        obiekt.addFigure(kwadrat);
        obiekt.addFigure(trojkat);
        obiekt.addFigure(kolo);
        System.out.println(obiekt.getShapeCollection());
        obiekt.removeFigure(trojkat);
        System.out.println(obiekt.getShapeCollection());

    }
}
