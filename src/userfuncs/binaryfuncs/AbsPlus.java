package userfuncs.binaryfuncs;

import userfuncs.binaryfuncs.BinaryFunc;

public class AbsPlus implements BinaryFunc {
    public String getName() {
        return "absPlus";
    }

    public int func(int a, int b) {
        return Math.abs(a) + Math.abs(b);
    }
}
