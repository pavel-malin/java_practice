enum Transport1 {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Transport1 tp;
        System.out.println("Constants Transport:");

        Transport1 allTransports[] = Transport1.values();

        for (Transport1 t : allTransports)
            System.out.println(t);
        System.out.println();

        tp = Transport1.valueOf("AIRPLANE");
        System.out.println("tp values " + tp);

    }
}
