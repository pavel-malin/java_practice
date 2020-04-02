package com.company;

class TwoDShape0 {
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

class Triangle0 extends TwoDShape0 {
    String style;

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class Shape0 {
    public static void main(String[] args) {
        Triangle0 t1 = new Triangle0();
        Triangle0 t2 = new Triangle0();

        t1.setHeight(4.0);
        t1.setHeight(4.0);
        t1.style = "painted over";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "contour";

        System.out.println("Information on t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.print("Area - " + t1.area());
        System.out.println();

        System.out.println("Information on t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area());
    }
}
