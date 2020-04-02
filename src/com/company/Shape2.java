package com.company;

class TwoDShape2 {
    private double width;
    private double height;

    TwoDShape2(double w, double h) {
        width = w;
        height = h;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and height - " + width + " and " + height);
    }
}

class Triangle2 extends TwoDShape2 {
    private String style;
    Triangle2(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class Shape2 {
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2("painted over", 4.0, 4.0);
        Triangle2 t2 = new Triangle2("counter", 8.0, 12.0);

        System.out.println("Information on t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area - " + t1.area());

        System.out.println("Information on t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area());
    }
}
