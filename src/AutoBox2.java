public class AutoBox2 {
    static void m(Integer v) {
        System.out.println("m() got " + v);
    }

    static int m2() {
        return 10;
    }

    static Integer m3() {
        return 99;
    }

    public static void main(String[] args) {
        m(199);

        Integer iOb = m2();
        System.out.println("The value returned from m2() " + iOb);

        int i = m3();
        System.out.println("The value returned from m3() " + i);

        iOb = 100;
        System.out.println("iOb square root: " + Math.sqrt(iOb));
    }
}
