enum Tools {
    SCREWDIVER, WRENCH, HAMMER, PLIERS
}

public class ShowEnum {
    public static void main(String[] args) {
        for (Tools d: Tools.values())
            System.out.println(d + " Matters order " + d.ordinal() + "\n");
    }
}
