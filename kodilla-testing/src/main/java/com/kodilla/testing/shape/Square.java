package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    private String shapeName = "Square";
    private int dlugoscBoku;


    public Square(int dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    @Override
    public String getShapeName(){
        return shapeName;
    }

    @Override
    public double getField(){
        return dlugoscBoku * dlugoscBoku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return dlugoscBoku == square.dlugoscBoku &&
                getShapeName().equals(square.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShapeName(), dlugoscBoku);
    }

    @Override
    public String toString() {
        return "Nazwa figury = " + shapeName + " dlugosc jego boku to " + dlugoscBoku + " cm";
    }
}
