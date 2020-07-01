enum Transport2 {
    CAR(100), TRUCK(80), AIRPLANE(900), TRAIN(120), BOAT(35);
    private int speed;

    Transport2 (int s) {
        speed = s;
    }

    int getSpeed () {
        return speed;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {
        Transport2 tp;

        System.out.println("Typical airplane speed: " + Transport2.AIRPLANE.getSpeed() +
                "km/h\n");

        System.out.println("Typical vehicle speeds");

        for (Transport2 t: Transport2.values())
            System.out.println(t + ": " + t.getSpeed() + "km/h");
    }
}
