package com.company;

class TwoDynShape {
    private double width;
    private double height;
    private String name;

    TwoDynShape() {
        width = height = 0.0;
        name = "none";
    }

    TwoDynShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDynShape(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDynShape(TwoDynShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
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

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Width and height - " + width + " and " + height);
    }

    double area() {
        System.out.println("Method area() must be redefined");
        return 0.0;
    }
}

class Triangle7 extends TwoDynShape {
    private String style;

    Triangle7() {
        super();
        style = "none";
    }

    Triangle7(String s, double w, double h) {
        super(w, h, "Triangle ");
        style = "painted over";
    }

    Triangle7(Triangle7 ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

class Rectangle extends TwoDynShape {
    Rectangle() {
        super();
    }

    Rectangle(double w, double h) {
        super(w, h, "triangle");
    }

    Rectangle(double x) {
        super(x, "triangle");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        if (getWidth() == getHeight())
            return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}

class DynShape {
    public static void main(String[] args) {
        TwoDynShape shape[] = new TwoDynShape[5];
        shape[0] = new Triangle7("contour", 8.0, 12.0);
        shape[1] = new Rectangle(10);
        shape[2] = new Rectangle(10, 4);
        shape[3] = new Rectangle(7.0);
        shape[4] = new TwoDynShape(10, 20, "figures");

        for (int i = 0; i < shape.length; i++) {
            System.out.println("Object - " + shape[i].getName());
            System.out.println("Area - " + shape[i].area());
            System.out.println();
        }
    }
}
