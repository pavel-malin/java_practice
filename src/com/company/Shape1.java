package com.company;

class TwoDShape1 {
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

class Triangle1 extends TwoDShape1 {
    private String style;

    Triangle1(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class Shape1 {
    public static void main(String[] args) {
        Triangle1 t1 = new Triangle1("painted over", 4.0, 4.0);
        Triangle1 t2 = new Triangle1("contour", 8.0, 12.0);

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
