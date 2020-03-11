package com.company;

class Vehicle0 {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return mpg * fuelcap;
    }
}

class RetMeth {
    public static void main(String[] args) {
        Vehicle0 minivan = new Vehicle0();
        Vehicle0 sportscar = new Vehicle0();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // range1 = minivan.range();
        // range2 = sportscar.range();

        System.out.println("The van can transport " +
                minivan.passengers + " passengers at a distance " +
                minivan.range() + " Miles.");  // range1

        System.out.println("A sports car can carry " +
                sportscar.passengers + " passengers at a distance " +
                sportscar.range() + " Miles."); // range2
    }
}
