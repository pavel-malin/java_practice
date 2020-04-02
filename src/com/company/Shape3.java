package com.company;

class TwoDShape3 {
    private double width;
    private double height;

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

class Triangle3 extends TwoDShape3 {
    private String style;

    Triangle3(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class Shape3 {
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3("painted over", 4.0, 4.0);
        Triangle3 t2 = new Triangle3("contour", 8.0, 12.0);

        System.out.println("Information on t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area - " + t1.area());
        System.out.println();

        System.out.println("Information on t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area());
    }
}
