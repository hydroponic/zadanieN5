package com.company;
import java.util.Scanner;
public abstract class Shape {
    private String color;
    private boolean filled;
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled=filled;
    }
}