package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    private String shapeName = "Square";
    private int sideLength;


    public Square(int dlugoscBoku) {
        this.sideLength = dlugoscBoku;
    }

    @Override
    public String getShapeName(){
        return shapeName;
    }

    @Override
    public double getField(){
        return sideLength * sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return sideLength == square.sideLength &&
                getShapeName().equals(square.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShapeName(), sideLength);
    }

    @Override
    public String toString() {
        return "Nazwa figury = " + shapeName + " dlugosc jego boku to " + sideLength + " cm";
    }
}
