package com.example.lab4exercise;

public class ReuleauxTriangle extends Shape {

    private int a;
    private int b;
    private int c;
    private int h;

    public ReuleauxTriangle(int x, int y, int a, int b, int c, int h) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;

    }
}
