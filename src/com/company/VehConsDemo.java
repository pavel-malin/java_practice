package com.company;

class Vehilca {
    int passengers;
    int fuelcap;
    int mpg;

    Vehilca(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return mpg *fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehConsDemo {
    public static void main(String[] args) {
        Vehilca minivan = new Vehilca(7, 16, 21);
        Vehilca sportscar = new Vehilca(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);
        System.out.println(dist + " miles " + gallons + " gallon");

        gallons = sportscar.fuelneeded(dist);
        System.out.println(dist + " miles " + gallons + " gallon");
    }
}
