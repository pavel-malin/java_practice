package com.company;

class Vehicle1 {
    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle1(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    int getPassengers() {
        return passengers;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    int getFuelcap() {
        return fuelcap;
    }

    void setFuelcap(int f) {
        fuelcap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }
}

class Truck extends Vehicle1 {
    private int cargocap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    int getCargo() {
        return cargocap;
    }

    void putCargo(int c) {
        cargocap = c;
    }
}

class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(2, 28, 15, 2000);

        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Truck can transport " + semi.getCargo() + " pounds. ");
        System.out.println("To overcome " + dist + " miles " + " the truck needs " + gallons + " gallons fuel.\n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Pickup truck can carry " + pickup.getCargo() + " pounds. ");
        System.out.println("To overcome " + dist + " miles " + " the truck needs " + gallons + " gallons fuel");
    }
}
