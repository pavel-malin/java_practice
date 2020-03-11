package com.company;

class Vehilce1 {
    int passengers;
    int fuelcap;
    int mpg;

    void range() {
        System.out.println("Range - " + fuelcap * mpg + " Miles.");
    }
}

class AddMeth {
    public static void main(String[] args) {
        Vehilce1 minivan = new Vehilce1();
        Vehilce1 sportscar = new Vehilce1();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;


        System.out.println("The van can transport " +
                minivan.passengers + " passengers at a distance.");

        minivan.range();

        System.out.println("A sports car can carry " +
                sportscar.passengers + " passengers at a distance.");

        sportscar.range();
    }
}
