package com.company;

class TwoDShape4 {
    private double width;
    private double height;

    TwoDShape4() {
        width = height = 0.0;
    }

    TwoDShape4(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShape4(double x) {
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
        System.out.println("Width and Height - " + width + " and " + height);
    }
}

class Triangle4 extends TwoDShape4 {
    private String style;

    Triangle4() {
        super();
        style = "none";
    }

    Triangle4(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    Triangle4(double x) {
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

class Shape4 {
    public static void main(String[] args) {
        Triangle4 t1 = new Triangle4();
        Triangle4 t2 = new Triangle4("contour", 8.0, 12.0);
        Triangle4 t3 = new Triangle4(4.0);

        t1 = t2;

        System.out.println("Information on t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area - " + t1.area());
        System.out.println();

        System.out.println("Information on t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area());
        System.out.println();

        System.out.println("Information on t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area - " + t3.area());
        System.out.println();
    }

}
