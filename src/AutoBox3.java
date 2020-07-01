public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;
        iOb = 99;

        System.out.println("Original iOb value: " + iOb);

        ++iOb;
        System.out.println("After ++iOb: " + iOb);

        iOb += 10;
        System.out.println("After +=10: " + iOb);

        iOb2 = iOb + (iOb/3);
        System.out.println("iOb2 after subtraction expression: " + iOb2);

        i = iOb + (iOb/3);
        System.out.println("i after subtraction expression: " + i);
    }
}
