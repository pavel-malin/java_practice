package com.company;

public class InchCentimeters {
    public static void main(String[] args) {
        double inch, centimeter;
        int counter;

        counter = 0;
        for (inch = 1; inch <= 144; inch++) {
            centimeter = inch * 39.37;
            System.out.println(inch + "i " + " " + centimeter + "m");

            counter++;
            if (inch == 12)
                System.out.println(" ");
                counter = 0;

        }


    }
}
