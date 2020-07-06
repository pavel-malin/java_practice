package userfuncs.binaryfuncs;

public class AbsMinus implements BinaryFunc {
    public String getName() {
        return "absMinus";
    }

    public int func(int a, int b) {
        return Math.abs(a) - Math.abs(b);
    }
}
