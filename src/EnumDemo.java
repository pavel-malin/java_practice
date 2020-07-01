enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo {
    public static void main(String[] args) {
        Transport tp;
        tp = Transport.AIRPLANE;

        System.out.println("Value tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        if (tp == Transport.TRAIN)
            System.out.println("tp contains TRAIN\n");

        switch (tp) {
            case CAR:
                System.out.println("The car carries people");
                break;
            case TRUCK:
                System.out.println("The truck carries cargo");
                break;
            case AIRPLANE:
                System.out.println("The plane is flying");
                break;
            case TRAIN:
                System.out.println("The rain moves on rails");
                break;
            case BOAT:
                System.out.println("Boat floating on the river");
                break;
        }
    }
}
