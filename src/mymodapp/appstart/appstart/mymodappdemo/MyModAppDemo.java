package mymodapp.appstart.appstart.mymodappdemo;

import mymodapp.appfuncs.appfuncs.simplefuncs.SimpleMathFuncs;

public class MyModAppDemo {
    public static void main(String[] args) {
        if (SimpleMathFuncs.isFactor(2, 10))
            System.out.println("2 is factor of 10");
        System.out.println("The smallest common factor fo 35 and 105 will be " + SimpleMathFuncs.gef(35, 105));
    }
}
