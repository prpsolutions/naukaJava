package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    private String shapeName = "Triangle";
    private int sideLength;
    private int height;

    public Triangle(int dlugoscBokuTrojkata, int wysokoscTrojkata){
        this.sideLength = dlugoscBokuTrojkata;
        this.height = wysokoscTrojkata;
    }

    @Override
    public String getShapeName(){
        return shapeName;
    }

    @Override
    public double getField(){
        return (sideLength * height) / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return sideLength == triangle.sideLength &&
                height == triangle.height &&
                getShapeName().equals(triangle.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShapeName(), sideLength, height);
    }

    @Override
    public String toString() {
        return "Nazwa figury = " + shapeName + " dlugosc jego boku to " +
                sideLength + " cm oraz wysokosc to " + height + " cm";
    }
}
