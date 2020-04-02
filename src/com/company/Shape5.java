package com.company;

class TwoDShape5 {
    private double width;
    private double height;

    TwoDShape5() {
        width = height = 0.0;
    }

    TwoDShape5(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShape5(double x) {
        width = height = x;
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

class Triangle5 extends TwoDShape5 {
    private String style;

    Triangle5() {
        super();
        style = "none";
    }

    Triangle5(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    Triangle5(double x) {
        super(x);
        style = "painted over";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class ColorTriangle extends Triangle5 {
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Color - " + color);
    }
}

class Shape5 {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("Blue", "Contour", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Red", "Painted over", 2.0, 2.0);

        System.out.println("Information on t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area - " + t1.area());
        System.out.println();

        System.out.println("Information on t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area - " + t2.area());
    }
}
