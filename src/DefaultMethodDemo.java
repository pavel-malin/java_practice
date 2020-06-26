
interface MyIf {
    int getUserID();

    default int getAdminID() {
        return 1;
    }
}

class MyIFImp implements MyIf {
    public int getUserID() {
        return 100;
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        System.out.println("User ID " + obj.getUserID());

        System.out.println("Administration ID " + obj.getAdminID());
    }
}
