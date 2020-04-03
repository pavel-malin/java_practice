package com.company;

abstract class TwoDShapeAbs {
    private double width;
    private double height;
    private String name;

    TwoDShapeAbs() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShapeAbs(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShapeAbs(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShapeAbs(TwoDShapeAbs ob) {
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
        System.out.println("Width and height - " + width + " " + height);
    }

    abstract double area();
}

class TriangleAbs extends TwoDShapeAbs {
    private String style;

    TriangleAbs() {
        super();
        style = "none";
    }

    TriangleAbs(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;
    }

    TriangleAbs(double x) {
        super(x, "triangle");
        style = "painted over";
    }

    TriangleAbs(TriangleAbs ob) {
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

class RectangleAbs extends TwoDShapeAbs {
    RectangleAbs() {
        super();
    }

    RectangleAbs(double w, double h) {
        super(w, h, "rectangle");
    }

    RectangleAbs(double x) {
        super(x, "rectangle");
    }

    RectangleAbs(RectangleAbs ob) {
        super(ob);
    }

    boolean isSquareAbs() {
        if(getWidth() == getHeight())
            return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}

class AbsShape {
    public static void main(String[] args) {
        TwoDShapeAbs shape[] = new TwoDShapeAbs[4];

        shape[0] = new TriangleAbs("contour", 8.0, 12.0);
        shape[1] = new RectangleAbs(10);
        shape[2] = new RectangleAbs(10, 4);
        shape[3] = new TriangleAbs(7.0);

        for (int i = 0; i < shape.length; i++) {
            System.out.println("Object - " + shape[i].getName());
            System.out.println("Area - " + shape[i].area());
            System.out.println();
        }
    }
}
