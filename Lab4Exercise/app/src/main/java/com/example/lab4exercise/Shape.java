package com.example.lab4exercise;

public abstract class Shape {
    private int x;
    private int y;

    private String color = "OrangeIsTheBestColor";

    Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
}
